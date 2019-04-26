package com.xul.account.domain;

import com.xul.account.support.MiniAccountConstant;
import com.xul.account.support.enums.DelStatus;
import com.xul.account.support.enums.PayWay;
import com.xul.account.support.enums.PaymentType;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 记账明细表
 * Created by lxu on 2018/12/11.
 */
@Entity
@Table(name = MiniAccountConstant.TABLE_NAME_PREFIX + "detail",
        indexes = {@Index(columnList = "username, accountYear, accountMonth, accountDay")})
@Where(clause = "delStatus = " + DelStatus.DEFAULT)
public class AccountDetail {

    /**
     * 用户名
     */
    @Column(name = "username", columnDefinition = "varchar(50) NOT NULL COMMENT '用户名'")
    private String username;

    /**
     * 金额,单位是元,保留两位小数
     */
    @Column(name = "money", columnDefinition = "decimal(15,2) NOT NULL COMMENT '金额,单位是元,保留两位小数'")
    private BigDecimal money;

    /**
     * 收支状态 0-支出 1-收入
     */
    @Column(name = "paymentType", columnDefinition = "tinyint(1) NOT NULL COMMENT '收支状态 0-支出 1-收入'")
    private PaymentType paymentType;

    /**
     * 记账类型ID
     */
    @Column(name = "accountTypeId", columnDefinition = "int(11) NOT NULL COMMENT '记账类型ID'")
    private Integer accountTypeId;

    /**
     * 记账时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "accountTime", columnDefinition = "datetime NOT NULL COMMENT '记账时间'")
    private Date accountTime;

    /**
     * 记账年份
     */
    @Column(name = "accountYear", columnDefinition = "int(11) NOT NULL COMMENT '记账年份'")
    private Integer accountYear;

    /**
     * 记账月份
     */
    @Column(name = "accountMonth", columnDefinition = "int(11) NOT NULL COMMENT '记账月份'")
    private Integer accountMonth;

    /**
     * 记账日
     */
    @Column(name = "accountDay", columnDefinition = "int(11) NOT NULL COMMENT '记账日'")
    private Integer accountDay;

    /**
     * 付款方式 0-现金 1-银行卡 2-信用卡 3-支付宝 4-微信
     */
    @Column(name = "payWay", columnDefinition = "tinyint(1) NOT NULL COMMENT '付款方式 0-现金 1-银行卡 2-信用卡 3-支付宝 4-微信'")
    private PayWay payWay;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public Integer getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(Integer accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public Date getAccountTime() {
        return accountTime;
    }

    public void setAccountTime(Date accountTime) {
        this.accountTime = accountTime;
    }

    public Integer getAccountYear() {
        return accountYear;
    }

    public void setAccountYear(Integer accountYear) {
        this.accountYear = accountYear;
    }

    public Integer getAccountMonth() {
        return accountMonth;
    }

    public void setAccountMonth(Integer accountMonth) {
        this.accountMonth = accountMonth;
    }

    public Integer getAccountDay() {
        return accountDay;
    }

    public void setAccountDay(Integer accountDay) {
        this.accountDay = accountDay;
    }

    public PayWay getPayWay() {
        return payWay;
    }

    public void setPayWay(PayWay payWay) {
        this.payWay = payWay;
    }
}
