package com.alone.mymall.mgb.mapper;

import com.alone.mymall.mgb.model.SmsFlashPromotionSession;
import com.alone.mymall.mgb.model.SmsFlashPromotionSessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsFlashPromotionSessionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_session
     *
     * @mbggenerated Sun Dec 15 20:51:06 CST 2019
     */
    int countByExample(SmsFlashPromotionSessionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_session
     *
     * @mbggenerated Sun Dec 15 20:51:06 CST 2019
     */
    int deleteByExample(SmsFlashPromotionSessionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_session
     *
     * @mbggenerated Sun Dec 15 20:51:06 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_session
     *
     * @mbggenerated Sun Dec 15 20:51:06 CST 2019
     */
    int insert(SmsFlashPromotionSession record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_session
     *
     * @mbggenerated Sun Dec 15 20:51:06 CST 2019
     */
    int insertSelective(SmsFlashPromotionSession record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_session
     *
     * @mbggenerated Sun Dec 15 20:51:06 CST 2019
     */
    List<SmsFlashPromotionSession> selectByExample(SmsFlashPromotionSessionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_session
     *
     * @mbggenerated Sun Dec 15 20:51:06 CST 2019
     */
    SmsFlashPromotionSession selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_session
     *
     * @mbggenerated Sun Dec 15 20:51:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") SmsFlashPromotionSession record, @Param("example") SmsFlashPromotionSessionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_session
     *
     * @mbggenerated Sun Dec 15 20:51:06 CST 2019
     */
    int updateByExample(@Param("record") SmsFlashPromotionSession record, @Param("example") SmsFlashPromotionSessionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_session
     *
     * @mbggenerated Sun Dec 15 20:51:06 CST 2019
     */
    int updateByPrimaryKeySelective(SmsFlashPromotionSession record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_session
     *
     * @mbggenerated Sun Dec 15 20:51:06 CST 2019
     */
    int updateByPrimaryKey(SmsFlashPromotionSession record);
}