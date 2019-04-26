package com.xul.account.support.enums;

/**
 * 收支状态 0-支出 1-收入
 * Created by lxu on 2019/04/26.
 */
public enum PaymentType {

    //支出
    INCOME(0, "INCOME"),
    //收入
    EXPEND(1, "EXPEND");

    private final int value;
    private final String name;

    PaymentType(int value, String name) {
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
        return "PaymentType{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
