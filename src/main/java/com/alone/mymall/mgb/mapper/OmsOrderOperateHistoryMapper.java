package com.alone.mymall.mgb.mapper;

import com.alone.mymall.mgb.model.OmsOrderOperateHistory;
import com.alone.mymall.mgb.model.OmsOrderOperateHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOrderOperateHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbggenerated Wed Dec 18 21:31:57 CST 2019
     */
    int countByExample(OmsOrderOperateHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbggenerated Wed Dec 18 21:31:57 CST 2019
     */
    int deleteByExample(OmsOrderOperateHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbggenerated Wed Dec 18 21:31:57 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbggenerated Wed Dec 18 21:31:57 CST 2019
     */
    int insert(OmsOrderOperateHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbggenerated Wed Dec 18 21:31:57 CST 2019
     */
    int insertSelective(OmsOrderOperateHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbggenerated Wed Dec 18 21:31:57 CST 2019
     */
    List<OmsOrderOperateHistory> selectByExample(OmsOrderOperateHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbggenerated Wed Dec 18 21:31:57 CST 2019
     */
    OmsOrderOperateHistory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbggenerated Wed Dec 18 21:31:57 CST 2019
     */
    int updateByExampleSelective(@Param("record") OmsOrderOperateHistory record, @Param("example") OmsOrderOperateHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbggenerated Wed Dec 18 21:31:57 CST 2019
     */
    int updateByExample(@Param("record") OmsOrderOperateHistory record, @Param("example") OmsOrderOperateHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbggenerated Wed Dec 18 21:31:57 CST 2019
     */
    int updateByPrimaryKeySelective(OmsOrderOperateHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbggenerated Wed Dec 18 21:31:57 CST 2019
     */
    int updateByPrimaryKey(OmsOrderOperateHistory record);
}