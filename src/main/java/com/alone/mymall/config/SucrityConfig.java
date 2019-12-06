package com.alone.mymall.config;


import com.alone.mymall.component.JwtAuthenticationTokenFilter;
import com.alone.mymall.component.RestAuthenticationEntryPoint;
import com.alone.mymall.component.RestfulAccessDeniedHandler;
import com.alone.mymall.mgb.model.UmsAdmin;
import com.alone.mymall.mgb.model.UmsPermission;
import com.alone.mymall.pojo.AdminUserDetails;
import com.alone.mymall.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.Filter;
import java.util.List;

/**
 * SpringSucrityConfig配置
 */
@Configurable
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SucrityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UmsAdminService adminService;
    @Autowired
    private RestAuthenticationEntryPoint restAuthenticationEntryPoint;
    @Autowired
    private RestfulAccessDeniedHandler restfulAccessDeniedHandler;
    /**
     * 重写configurable 
     * 该方法设置了不同的url不同的访问权限、jwt的过滤器及出异常后的处理器
     * @param httpSecurity
     */
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.csrf()
        .disable()
        .sessionManagement()//基于token，所以不需要session
        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        .and()
        .authorizeRequests()
        .antMatchers(HttpMethod.GET,//允许对网站的静态资源的无权限访问
        "/",
        "/*.html",
        "/favicon.ico",
        "/**/*.html",
        "/**/*.css",
        "/**/*.js",
        "/swagger-resources/**",
        "/v2/api-docs/**",
        "/webjars/springfox-swagger-ui/**"
        )
        .permitAll()
        .antMatchers("/admin/login","/admin/register")//对登录注册允许匿名访问
        .permitAll()
        .antMatchers(HttpMethod.OPTIONS)//跨域请求会先进行一次options请求
                .permitAll()
         //       .antMatchers("/**")//测试时全部运行访问
           //     .permitAll()
                .anyRequest()// 除上面外的所有请求全部需要鉴权认证
                .authenticated();
        //禁用缓存
        httpSecurity.headers().cacheControl();
        //添加JWT的Filter
        httpSecurity.addFilterBefore(jwtAuthenticationTokenFilter(), UsernamePasswordAuthenticationFilter.class);
        //添加自定义未授权和未登录的返回结果
        httpSecurity.exceptionHandling().accessDeniedHandler(restfulAccessDeniedHandler)//restFulAccessDeiedhandler用户没有访问权限时的处理器，用于返回处理过的JSON
                                        .authenticationEntryPoint
                                        (restAuthenticationEntryPoint);//restAuthenticationEntryPoint当未登录或token过期时，返回JSON格式的结果
    }

    /**
     * 用来配置UserDetailsService及passwordEcoder
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService())
                .passwordEncoder(passwordEncoder());
    }



    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     * SpringSucrity定义的核心接口，用于根据用户名获取用户信息，需要实现
     */
    @Bean
    public UserDetailsService userDetailsService() {
        //获取登录用户信息
        return username -> {
            UmsAdmin admin = adminService.getAdminByUsername(username);
            if (admin != null) {
                List<UmsPermission> permissionList = adminService.getPermissionList(admin.getId());
                return new AdminUserDetails(admin,permissionList);
            }
            throw new UsernameNotFoundException("用户名或密码错误");
        };
    }
    @Bean
    public Filter jwtAuthenticationTokenFilter(){
        return new JwtAuthenticationTokenFilter();
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}   