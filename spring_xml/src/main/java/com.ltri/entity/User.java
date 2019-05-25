package com.ltri.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * create by com.ltri on 2019/05/25 15:32
 */
public class User {
    //主键id
    private Long id;
    //用户名
    private String name;
    //用户余额
    private BigDecimal money;
    //生日
    private LocalDate birth;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public User(Long id, String name, BigDecimal money, LocalDate birth) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.birth = birth;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", birth=" + birth +
                '}';
    }
}
