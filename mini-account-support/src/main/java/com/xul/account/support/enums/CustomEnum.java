package com.xul.account.support.enums;

/**
 * 是否自定义 0-否 1-是
 * Created by lxu on 2019/4/26.
 */
public enum CustomEnum {

    //否
    NO(0, "NO"),
    //是
    YES(1, "YES");

    private final int value;
    private final String name;

    CustomEnum(int value, String name) {
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
        return "CustomEnum{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }}
