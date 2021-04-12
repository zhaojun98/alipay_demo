package com.zhaojun.alipay_demo.alipay;

import lombok.Data;

/*
* Tips：转账用到的类
* */
@Data
public class TransferParams {

    /**
     * 应用编号
     */
    private Long appId;

    /**
     * 创建人id
     */
    private Long createdBy;

    /**
     * 转账业务订单号
     */
    private String outBizNo;

    /**
     * 收款方识别方式
     */
    private String payeeType;

    /**
     * 收款方账号，可以是支付宝userId或者支付宝loginId
     */
    private String payeeAccount;

    /**
     * 转账金额，单位分
     */
    private String amount;

    /**
     * 付款方名称
     */
    private String payerShowName;

    /**
     * 收款方名称
     */
    private String payeeRealName;

    /**
     * 备注
     */
    private String remark;

    /**
     * 支付宝转账流水号
     */
    private String orderId;
}