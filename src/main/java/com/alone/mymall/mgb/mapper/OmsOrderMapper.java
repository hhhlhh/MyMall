package com.alone.mymall.mgb.mapper;

import com.alone.mymall.mgb.model.OmsOrder;
import com.alone.mymall.mgb.model.OmsOrderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface OmsOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbggenerated Wed Dec 18 21:18:05 CST 2019
     */
    int countByExample(OmsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbggenerated Wed Dec 18 21:18:05 CST 2019
     */
    int deleteByExample(OmsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbggenerated Wed Dec 18 21:18:05 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbggenerated Wed Dec 18 21:18:05 CST 2019
     */
    int insert(OmsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbggenerated Wed Dec 18 21:18:05 CST 2019
     */
    int insertSelective(OmsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbggenerated Wed Dec 18 21:18:05 CST 2019
     */
    List<OmsOrder> selectByExample(OmsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbggenerated Wed Dec 18 21:18:05 CST 2019
     */
    OmsOrder selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbggenerated Wed Dec 18 21:18:05 CST 2019
     */
    int updateByExampleSelective(@Param("record") OmsOrder record, @Param("example") OmsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbggenerated Wed Dec 18 21:18:05 CST 2019
     */
    int updateByExample(@Param("record") OmsOrder record, @Param("example") OmsOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbggenerated Wed Dec 18 21:18:05 CST 2019
     */
    int updateByPrimaryKeySelective(OmsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbggenerated Wed Dec 18 21:18:05 CST 2019
     */
    int updateByPrimaryKey(OmsOrder record);
}