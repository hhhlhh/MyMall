package com.alone.mymall.mgb.mapper;

import com.alone.mymall.mgb.model.UmsAdmin;
import com.alone.mymall.mgb.model.UmsAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsAdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbggenerated Sun Dec 01 12:09:45 CST 2019
     */
    int countByExample(UmsAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbggenerated Sun Dec 01 12:09:45 CST 2019
     */
    int deleteByExample(UmsAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbggenerated Sun Dec 01 12:09:45 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbggenerated Sun Dec 01 12:09:45 CST 2019
     */
    int insert(UmsAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbggenerated Sun Dec 01 12:09:45 CST 2019
     */
    int insertSelective(UmsAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbggenerated Sun Dec 01 12:09:45 CST 2019
     */
    List<UmsAdmin> selectByExample(UmsAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbggenerated Sun Dec 01 12:09:45 CST 2019
     */
    UmsAdmin selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbggenerated Sun Dec 01 12:09:45 CST 2019
     */
    int updateByExampleSelective(@Param("record") UmsAdmin record, @Param("example") UmsAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbggenerated Sun Dec 01 12:09:45 CST 2019
     */
    int updateByExample(@Param("record") UmsAdmin record, @Param("example") UmsAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbggenerated Sun Dec 01 12:09:45 CST 2019
     */
    int updateByPrimaryKeySelective(UmsAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin
     *
     * @mbggenerated Sun Dec 01 12:09:45 CST 2019
     */
    int updateByPrimaryKey(UmsAdmin record);
}