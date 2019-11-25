package com.alone.mymall.mgb.mapper;

import com.alone.mymall.mgb.model.PmsProductFullReduction;
import com.alone.mymall.mgb.model.PmsProductFullReductionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductFullReductionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbggenerated Sun Nov 24 21:54:18 CST 2019
     */
    int countByExample(PmsProductFullReductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbggenerated Sun Nov 24 21:54:18 CST 2019
     */
    int deleteByExample(PmsProductFullReductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbggenerated Sun Nov 24 21:54:18 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbggenerated Sun Nov 24 21:54:18 CST 2019
     */
    int insert(PmsProductFullReduction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbggenerated Sun Nov 24 21:54:18 CST 2019
     */
    int insertSelective(PmsProductFullReduction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbggenerated Sun Nov 24 21:54:18 CST 2019
     */
    List<PmsProductFullReduction> selectByExample(PmsProductFullReductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbggenerated Sun Nov 24 21:54:18 CST 2019
     */
    PmsProductFullReduction selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbggenerated Sun Nov 24 21:54:18 CST 2019
     */
    int updateByExampleSelective(@Param("record") PmsProductFullReduction record, @Param("example") PmsProductFullReductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbggenerated Sun Nov 24 21:54:18 CST 2019
     */
    int updateByExample(@Param("record") PmsProductFullReduction record, @Param("example") PmsProductFullReductionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbggenerated Sun Nov 24 21:54:18 CST 2019
     */
    int updateByPrimaryKeySelective(PmsProductFullReduction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_full_reduction
     *
     * @mbggenerated Sun Nov 24 21:54:18 CST 2019
     */
    int updateByPrimaryKey(PmsProductFullReduction record);
}