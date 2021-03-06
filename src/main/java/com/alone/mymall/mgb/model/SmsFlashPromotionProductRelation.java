package com.alone.mymall.mgb.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class SmsFlashPromotionProductRelation implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_flash_promotion_product_relation.id
     *
     * @mbggenerated Sun Dec 15 20:46:17 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_flash_promotion_product_relation.flash_promotion_id
     *
     * @mbggenerated Sun Dec 15 20:46:17 CST 2019
     */
    private Long flashPromotionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_flash_promotion_product_relation.flash_promotion_session_id
     *
     * @mbggenerated Sun Dec 15 20:46:17 CST 2019
     */
    private Long flashPromotionSessionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_flash_promotion_product_relation.product_id
     *
     * @mbggenerated Sun Dec 15 20:46:17 CST 2019
     */
    private Long productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_flash_promotion_product_relation.flash_promotion_price
     *
     * @mbggenerated Sun Dec 15 20:46:17 CST 2019
     */
    private BigDecimal flashPromotionPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_flash_promotion_product_relation.flash_promotion_count
     *
     * @mbggenerated Sun Dec 15 20:46:17 CST 2019
     */
    private Integer flashPromotionCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_flash_promotion_product_relation.flash_promotion_limit
     *
     * @mbggenerated Sun Dec 15 20:46:17 CST 2019
     */
    private Integer flashPromotionLimit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_flash_promotion_product_relation.sort
     *
     * @mbggenerated Sun Dec 15 20:46:17 CST 2019
     */
    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sms_flash_promotion_product_relation
     *
     * @mbggenerated Sun Dec 15 20:46:17 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_product_relation.id
     *
     * @return the value of sms_flash_promotion_product_relation.id
     *
     * @mbggenerated Sun Dec 15 20:46:17 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_product_relation.id
     *
     * @param id the value for sms_flash_promotion_product_relation.id
     *
     * @mbggenerated Sun Dec 15 20:46:17 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_product_relation.flash_promotion_id
     *
     * @return the value of sms_flash_promotion_product_relation.flash_promotion_id
     *
     * @mbggenerated Sun Dec 15 20:46:17 CST 2019
     */
    public Long getFlashPromotionId() {
        return flashPromotionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_product_relation.flash_promotion_id
     *
     * @param flashPromotionId the value for sms_flash_promotion_product_relation.flash_promotion_id
     *
     * @mbggenerated Sun Dec 15 20:46:17 CST 2019
     */
    public void setFlashPromotionId(Long flashPromotionId) {
        this.flashPromotionId = flashPromotionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_product_relation.flash_promotion_session_id
     *
     * @return the value of sms_flash_promotion_product_relation.flash_promotion_session_id
     *
     * @mbggenerated Sun Dec 15 20:46:17 CST 2019
     */
    public Long getFlashPromotionSessionId() {
        return flashPromotionSessionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_product_relation.flash_promotion_session_id
     *
     * @param flashPromotionSessionId the value for sms_flash_promotion_product_relation.flash_promotion_session_id
     *
     * @mbggenerated Sun Dec 15 20:46:17 CST 2019
     */
    public void setFlashPromotionSessionId(Long flashPromotionSessionId) {
        this.flashPromotionSessionId = flashPromotionSessionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_product_relation.product_id
     *
     * @return the value of sms_flash_promotion_product_relation.product_id
     *
     * @mbggenerated Sun Dec 15 20:46:17 CST 2019
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_product_relation.product_id
     *
     * @param productId the value for sms_flash_promotion_product_relation.product_id
     *
     * @mbggenerated Sun Dec 15 20:46:17 CST 2019
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_product_relation.flash_promotion_price
     *
     * @return the value of sms_flash_promotion_product_relation.flash_promotion_price
     *
     * @mbggenerated Sun Dec 15 20:46:17 CST 2019
     */
    public BigDecimal getFlashPromotionPrice() {
        return flashPromotionPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_product_relation.flash_promotion_price
     *
     * @param flashPromotionPrice the value for sms_flash_promotion_product_relation.flash_promotion_price
     *
     * @mbggenerated Sun Dec 15 20:46:17 CST 2019
     */
    public void setFlashPromotionPrice(BigDecimal flashPromotionPrice) {
        this.flashPromotionPrice = flashPromotionPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_product_relation.flash_promotion_count
     *
     * @return the value of sms_flash_promotion_product_relation.flash_promotion_count
     *
     * @mbggenerated Sun Dec 15 20:46:17 CST 2019
     */
    public Integer getFlashPromotionCount() {
        return flashPromotionCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_product_relation.flash_promotion_count
     *
     * @param flashPromotionCount the value for sms_flash_promotion_product_relation.flash_promotion_count
     *
     * @mbggenerated Sun Dec 15 20:46:17 CST 2019
     */
    public void setFlashPromotionCount(Integer flashPromotionCount) {
        this.flashPromotionCount = flashPromotionCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_product_relation.flash_promotion_limit
     *
     * @return the value of sms_flash_promotion_product_relation.flash_promotion_limit
     *
     * @mbggenerated Sun Dec 15 20:46:17 CST 2019
     */
    public Integer getFlashPromotionLimit() {
        return flashPromotionLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_product_relation.flash_promotion_limit
     *
     * @param flashPromotionLimit the value for sms_flash_promotion_product_relation.flash_promotion_limit
     *
     * @mbggenerated Sun Dec 15 20:46:17 CST 2019
     */
    public void setFlashPromotionLimit(Integer flashPromotionLimit) {
        this.flashPromotionLimit = flashPromotionLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_flash_promotion_product_relation.sort
     *
     * @return the value of sms_flash_promotion_product_relation.sort
     *
     * @mbggenerated Sun Dec 15 20:46:17 CST 2019
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_flash_promotion_product_relation.sort
     *
     * @param sort the value for sms_flash_promotion_product_relation.sort
     *
     * @mbggenerated Sun Dec 15 20:46:17 CST 2019
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_flash_promotion_product_relation
     *
     * @mbggenerated Sun Dec 15 20:46:17 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", flashPromotionId=").append(flashPromotionId);
        sb.append(", flashPromotionSessionId=").append(flashPromotionSessionId);
        sb.append(", productId=").append(productId);
        sb.append(", flashPromotionPrice=").append(flashPromotionPrice);
        sb.append(", flashPromotionCount=").append(flashPromotionCount);
        sb.append(", flashPromotionLimit=").append(flashPromotionLimit);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}