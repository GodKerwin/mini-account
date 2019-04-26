package com.xul.account.support.enums;

/**
 * 付款方式 0-现金 1-银行卡 2-信用卡 3-支付宝 4-微信
 * Created by lxu on 2019/04/26.
 */
public enum PayWay {

    //现金
    CASH(0, "CASH"),
    //银行卡
    BANK(1, "BANK"),
    //信用卡
    CREDIT(2, "CREDIT"),
    //支付宝
    ALIPAY(3, "ALIPAY"),
    //银行卡
    WECHAT(4, "WECHAT");

    private final int value;
    private final String name;

    PayWay(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PayWay{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }}
