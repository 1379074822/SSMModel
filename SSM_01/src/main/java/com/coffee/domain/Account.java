package com.coffee.domain;

import java.io.Serializable;

/**
 * @program: SSM_01
 * @description:
 * @author: Mr.Lian
 * @create: 2019-07-09 15:50
 **/
public class Account implements Serializable {
    private String id;
    private String name;
    private Double money;

    public Account(String name, Double money) {
        this.name = name;
        this.money = money;
    }

    public Account() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
