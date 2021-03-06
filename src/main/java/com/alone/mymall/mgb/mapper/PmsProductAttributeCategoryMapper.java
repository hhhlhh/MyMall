package com.alone.mymall.mgb.mapper;

import com.alone.mymall.mgb.model.PmsProductAttributeCategory;
import com.alone.mymall.mgb.model.PmsProductAttributeCategoryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmsProductAttributeCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_category
     *
     * @mbggenerated Fri Nov 15 21:59:12 CST 2019
     */
    int countByExample(PmsProductAttributeCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_category
     *
     * @mbggenerated Fri Nov 15 21:59:12 CST 2019
     */
    int deleteByExample(PmsProductAttributeCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_category
     *
     * @mbggenerated Fri Nov 15 21:59:12 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_category
     *
     * @mbggenerated Fri Nov 15 21:59:12 CST 2019
     */
    int insert(PmsProductAttributeCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_category
     *
     * @mbggenerated Fri Nov 15 21:59:12 CST 2019
     */
    int insertSelective(PmsProductAttributeCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_category
     *
     * @mbggenerated Fri Nov 15 21:59:12 CST 2019
     */
    List<PmsProductAttributeCategory> selectByExample(PmsProductAttributeCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_category
     *
     * @mbggenerated Fri Nov 15 21:59:12 CST 2019
     */
    PmsProductAttributeCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_category
     *
     * @mbggenerated Fri Nov 15 21:59:12 CST 2019
     */
    int updateByExampleSelective(@Param("record") PmsProductAttributeCategory record, @Param("example") PmsProductAttributeCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_category
     *
     * @mbggenerated Fri Nov 15 21:59:12 CST 2019
     */
    int updateByExample(@Param("record") PmsProductAttributeCategory record, @Param("example") PmsProductAttributeCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_category
     *
     * @mbggenerated Fri Nov 15 21:59:12 CST 2019
     */
    int updateByPrimaryKeySelective(PmsProductAttributeCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute_category
     *
     * @mbggenerated Fri Nov 15 21:59:12 CST 2019
     */
    int updateByPrimaryKey(PmsProductAttributeCategory record);
}