package com.xul.account.domain;

import com.xul.account.support.MiniAccountConstant;
import com.xul.account.support.enums.CustomEnum;
import com.xul.account.support.enums.DelStatus;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * 记账类型表
 * Created by lxu on 2018/12/11.
 */
@Entity
@Table(name = MiniAccountConstant.TABLE_NAME_PREFIX + "type", uniqueConstraints = {@UniqueConstraint(columnNames = {"typeName"})})
@Where(clause = "delStatus = " + DelStatus.DEFAULT)
public class AccountType {

    /**
     * 记账类型
     */
    @Column(name = "typeName", columnDefinition = "varchar(20) NOT NULL COMMENT '记账类型'")
    private String typeName;

    /**
     * 是否自定义 0-否 1-是
     */
    @Column(name = "isCustom", columnDefinition = "tinyint(1) NOT NULL COMMENT '是否自定义 0-否 1-是'")
    private CustomEnum isCustom;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public CustomEnum getIsCustom() {
        return isCustom;
    }

    public void setIsCustom(CustomEnum isCustom) {
        this.isCustom = isCustom;
    }
}
