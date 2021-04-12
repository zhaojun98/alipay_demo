package com.zhaojun.alipay_demo.alipay;


import com.alipay.api.domain.Participant;
import lombok.Data;
import java.math.BigDecimal;

/**
 * 支付宝转账参数
 */
@Data
public class BizContentForUniTransfer {
    /**
     * 业务订单号
     */
    private String out_biz_no;

    /**
     * 订单总金额，单位为元，精确到小数点后两位，
     */
    private BigDecimal trans_amount;

    /**
     * 业务产品码，
     * 单笔无密转账到支付宝账户固定为:TRANS_ACCOUNT_NO_PWD；
     * 单笔无密转账到银行卡固定为:TRANS_BANKCARD_NO_PWD;
     * 收发现金红包固定为:STD_RED_PACKET；
     */
    private String product_code;

    /**
     * 描述特定的业务场景，可传的参数如下：
     * DIRECT_TRANSFER：单笔无密转账到支付宝/银行卡, B2C现金红包;
     * PERSONAL_COLLECTION：C2C现金红包-领红包
     */
    private String biz_scene;

    /**
     * 转账业务的标题，用于在支付宝用户的账单里显示
     */
    private String order_title;

    /**
     * 原支付宝业务单号。C2C现金红包-红包领取时，传红包支付时返回的支付宝单号；
     * B2C现金红包、单笔无密转账到支付宝/银行卡不需要该参数。
     */
    private String original_order_id;

    /**
     * 业务备注
     */
    private String remark;

    /**
     * 转账业务请求的扩展参数，支持传入的扩展参数如下：
     * 1、sub_biz_scene 子业务场景，红包业务必传，取值REDPACKET，C2C现金红包、B2C现金红包均需传入；
     * 2、withdraw_timeliness为转账到银行卡的预期到账时间，可选（不传入则默认为T1），
     * 取值T0表示预期T+0到账，取值T1表示预期T+1到账，因到账时效受银行机构处理影响，支付宝无法保证一定是T0或者T1到账；
     */
    private String business_params;

    /**
     * 支付收款对象
     */
    private Participant payee_info;
}