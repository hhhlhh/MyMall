package com.alone.mymall.mgb.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OmsOrderReturnApply implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.id
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.order_id
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private Long orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.company_address_id
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private Long companyAddressId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.product_id
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private Long productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.order_sn
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private String orderSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.create_time
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.member_username
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private String memberUsername;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.return_amount
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private BigDecimal returnAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.return_name
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private String returnName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.return_phone
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private String returnPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.status
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.handle_time
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private Date handleTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.product_pic
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private String productPic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.product_name
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private String productName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.product_brand
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private String productBrand;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.product_attr
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private String productAttr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.product_count
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private Integer productCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.product_price
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private BigDecimal productPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.product_real_price
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private BigDecimal productRealPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.reason
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private String reason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.description
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.proof_pics
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private String proofPics;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.handle_note
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private String handleNote;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.handle_man
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private String handleMan;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.receive_man
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private String receiveMan;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.receive_time
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private Date receiveTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_return_apply.receive_note
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private String receiveNote;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table oms_order_return_apply
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.id
     *
     * @return the value of oms_order_return_apply.id
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.id
     *
     * @param id the value for oms_order_return_apply.id
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.order_id
     *
     * @return the value of oms_order_return_apply.order_id
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.order_id
     *
     * @param orderId the value for oms_order_return_apply.order_id
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.company_address_id
     *
     * @return the value of oms_order_return_apply.company_address_id
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public Long getCompanyAddressId() {
        return companyAddressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.company_address_id
     *
     * @param companyAddressId the value for oms_order_return_apply.company_address_id
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setCompanyAddressId(Long companyAddressId) {
        this.companyAddressId = companyAddressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.product_id
     *
     * @return the value of oms_order_return_apply.product_id
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.product_id
     *
     * @param productId the value for oms_order_return_apply.product_id
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.order_sn
     *
     * @return the value of oms_order_return_apply.order_sn
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.order_sn
     *
     * @param orderSn the value for oms_order_return_apply.order_sn
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.create_time
     *
     * @return the value of oms_order_return_apply.create_time
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.create_time
     *
     * @param createTime the value for oms_order_return_apply.create_time
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.member_username
     *
     * @return the value of oms_order_return_apply.member_username
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public String getMemberUsername() {
        return memberUsername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.member_username
     *
     * @param memberUsername the value for oms_order_return_apply.member_username
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.return_amount
     *
     * @return the value of oms_order_return_apply.return_amount
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public BigDecimal getReturnAmount() {
        return returnAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.return_amount
     *
     * @param returnAmount the value for oms_order_return_apply.return_amount
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setReturnAmount(BigDecimal returnAmount) {
        this.returnAmount = returnAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.return_name
     *
     * @return the value of oms_order_return_apply.return_name
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public String getReturnName() {
        return returnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.return_name
     *
     * @param returnName the value for oms_order_return_apply.return_name
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.return_phone
     *
     * @return the value of oms_order_return_apply.return_phone
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public String getReturnPhone() {
        return returnPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.return_phone
     *
     * @param returnPhone the value for oms_order_return_apply.return_phone
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setReturnPhone(String returnPhone) {
        this.returnPhone = returnPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.status
     *
     * @return the value of oms_order_return_apply.status
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.status
     *
     * @param status the value for oms_order_return_apply.status
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.handle_time
     *
     * @return the value of oms_order_return_apply.handle_time
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public Date getHandleTime() {
        return handleTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.handle_time
     *
     * @param handleTime the value for oms_order_return_apply.handle_time
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.product_pic
     *
     * @return the value of oms_order_return_apply.product_pic
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public String getProductPic() {
        return productPic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.product_pic
     *
     * @param productPic the value for oms_order_return_apply.product_pic
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.product_name
     *
     * @return the value of oms_order_return_apply.product_name
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.product_name
     *
     * @param productName the value for oms_order_return_apply.product_name
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.product_brand
     *
     * @return the value of oms_order_return_apply.product_brand
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public String getProductBrand() {
        return productBrand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.product_brand
     *
     * @param productBrand the value for oms_order_return_apply.product_brand
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.product_attr
     *
     * @return the value of oms_order_return_apply.product_attr
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public String getProductAttr() {
        return productAttr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.product_attr
     *
     * @param productAttr the value for oms_order_return_apply.product_attr
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.product_count
     *
     * @return the value of oms_order_return_apply.product_count
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public Integer getProductCount() {
        return productCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.product_count
     *
     * @param productCount the value for oms_order_return_apply.product_count
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.product_price
     *
     * @return the value of oms_order_return_apply.product_price
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.product_price
     *
     * @param productPrice the value for oms_order_return_apply.product_price
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.product_real_price
     *
     * @return the value of oms_order_return_apply.product_real_price
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public BigDecimal getProductRealPrice() {
        return productRealPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.product_real_price
     *
     * @param productRealPrice the value for oms_order_return_apply.product_real_price
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setProductRealPrice(BigDecimal productRealPrice) {
        this.productRealPrice = productRealPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.reason
     *
     * @return the value of oms_order_return_apply.reason
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public String getReason() {
        return reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.reason
     *
     * @param reason the value for oms_order_return_apply.reason
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.description
     *
     * @return the value of oms_order_return_apply.description
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.description
     *
     * @param description the value for oms_order_return_apply.description
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.proof_pics
     *
     * @return the value of oms_order_return_apply.proof_pics
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public String getProofPics() {
        return proofPics;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.proof_pics
     *
     * @param proofPics the value for oms_order_return_apply.proof_pics
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setProofPics(String proofPics) {
        this.proofPics = proofPics;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.handle_note
     *
     * @return the value of oms_order_return_apply.handle_note
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public String getHandleNote() {
        return handleNote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.handle_note
     *
     * @param handleNote the value for oms_order_return_apply.handle_note
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setHandleNote(String handleNote) {
        this.handleNote = handleNote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.handle_man
     *
     * @return the value of oms_order_return_apply.handle_man
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public String getHandleMan() {
        return handleMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.handle_man
     *
     * @param handleMan the value for oms_order_return_apply.handle_man
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setHandleMan(String handleMan) {
        this.handleMan = handleMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.receive_man
     *
     * @return the value of oms_order_return_apply.receive_man
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public String getReceiveMan() {
        return receiveMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.receive_man
     *
     * @param receiveMan the value for oms_order_return_apply.receive_man
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setReceiveMan(String receiveMan) {
        this.receiveMan = receiveMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.receive_time
     *
     * @return the value of oms_order_return_apply.receive_time
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.receive_time
     *
     * @param receiveTime the value for oms_order_return_apply.receive_time
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_return_apply.receive_note
     *
     * @return the value of oms_order_return_apply.receive_note
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public String getReceiveNote() {
        return receiveNote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_return_apply.receive_note
     *
     * @param receiveNote the value for oms_order_return_apply.receive_note
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    public void setReceiveNote(String receiveNote) {
        this.receiveNote = receiveNote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_return_apply
     *
     * @mbggenerated Wed Dec 18 21:26:17 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", companyAddressId=").append(companyAddressId);
        sb.append(", productId=").append(productId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", createTime=").append(createTime);
        sb.append(", memberUsername=").append(memberUsername);
        sb.append(", returnAmount=").append(returnAmount);
        sb.append(", returnName=").append(returnName);
        sb.append(", returnPhone=").append(returnPhone);
        sb.append(", status=").append(status);
        sb.append(", handleTime=").append(handleTime);
        sb.append(", productPic=").append(productPic);
        sb.append(", productName=").append(productName);
        sb.append(", productBrand=").append(productBrand);
        sb.append(", productAttr=").append(productAttr);
        sb.append(", productCount=").append(productCount);
        sb.append(", productPrice=").append(productPrice);
        sb.append(", productRealPrice=").append(productRealPrice);
        sb.append(", reason=").append(reason);
        sb.append(", description=").append(description);
        sb.append(", proofPics=").append(proofPics);
        sb.append(", handleNote=").append(handleNote);
        sb.append(", handleMan=").append(handleMan);
        sb.append(", receiveMan=").append(receiveMan);
        sb.append(", receiveTime=").append(receiveTime);
        sb.append(", receiveNote=").append(receiveNote);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}