package com.alone.mymall.mgb.mapper;

import com.alone.mymall.mgb.model.CmsPrefrenceAreaProductRelation;
import com.alone.mymall.mgb.model.CmsPrefrenceAreaProductRelationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CmsPrefrenceAreaProductRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area_product_relation
     *
     * @mbggenerated Fri Dec 20 11:50:44 CST 2019
     */
    int countByExample(CmsPrefrenceAreaProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area_product_relation
     *
     * @mbggenerated Fri Dec 20 11:50:44 CST 2019
     */
    int deleteByExample(CmsPrefrenceAreaProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area_product_relation
     *
     * @mbggenerated Fri Dec 20 11:50:44 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area_product_relation
     *
     * @mbggenerated Fri Dec 20 11:50:44 CST 2019
     */
    int insert(CmsPrefrenceAreaProductRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area_product_relation
     *
     * @mbggenerated Fri Dec 20 11:50:44 CST 2019
     */
    int insertSelective(CmsPrefrenceAreaProductRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area_product_relation
     *
     * @mbggenerated Fri Dec 20 11:50:44 CST 2019
     */
    List<CmsPrefrenceAreaProductRelation> selectByExample(CmsPrefrenceAreaProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area_product_relation
     *
     * @mbggenerated Fri Dec 20 11:50:44 CST 2019
     */
    CmsPrefrenceAreaProductRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area_product_relation
     *
     * @mbggenerated Fri Dec 20 11:50:44 CST 2019
     */
    int updateByExampleSelective(@Param("record") CmsPrefrenceAreaProductRelation record, @Param("example") CmsPrefrenceAreaProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area_product_relation
     *
     * @mbggenerated Fri Dec 20 11:50:44 CST 2019
     */
    int updateByExample(@Param("record") CmsPrefrenceAreaProductRelation record, @Param("example") CmsPrefrenceAreaProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area_product_relation
     *
     * @mbggenerated Fri Dec 20 11:50:44 CST 2019
     */
    int updateByPrimaryKeySelective(CmsPrefrenceAreaProductRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area_product_relation
     *
     * @mbggenerated Fri Dec 20 11:50:44 CST 2019
     */
    int updateByPrimaryKey(CmsPrefrenceAreaProductRelation record);
}