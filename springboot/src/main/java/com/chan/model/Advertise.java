package com.chan.model;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Advertise {
    private Integer id;

    @Value("${Advertise.name}")
    private String advertisetment;

    private Double money;

    private String datetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdvertisetment() {
        return advertisetment;
    }

    public void setAdvertisetment(String advertisetment) {
        this.advertisetment = advertisetment == null ? null : advertisetment.trim();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime == null ? null : datetime.trim();
    }
}
