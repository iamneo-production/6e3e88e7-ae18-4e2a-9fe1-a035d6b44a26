package com.examly.springapp.model;



import javax.persistence.*;
import java.io.Serializable;

@Entity

public class User implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(nullable = false, updatable = false)
    private long id;
    private String rechargeType;
    private String rechargeEmail;
    private String rechargeName;
    private String rechargePlan;
    private String rechargeNumber;
    private String rechargePrice;


    public User() {
    }

    public User(long id, String rechargeType, String rechargeEmail, String rechargeName, String rechargePlan, String rechargeNumber, String rechargePrice) {
        this.id = id;
        this.rechargeType = rechargeType;
        this.rechargeEmail = rechargeEmail ;
        this.rechargeName = rechargeName;
        this.rechargePlan = rechargePlan;
        this.rechargeNumber = rechargeNumber;
        this.rechargePrice = rechargePrice;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRechargeType() {
        return rechargeType;
    }

    public void setRechargeType(String rechargeType) {
        this.rechargeType = rechargeType;
    }

    public String getRechargeEmail() {
        return rechargeEmail;
    }

    public void setRechargeEmail(String rechargeEmail) {
        this.rechargeEmail = rechargeEmail;
    }

    public String getRechargeName() {
        return rechargeName;
    }

    public void setRechargeName(String rechargeName) {
        this.rechargeName = rechargeName;
    }

    public String getRechargePlan() {
        return rechargePlan;
    }

    public void setRechargePlan(String rechargePlan) {
        this.rechargePlan = rechargePlan;
    }

    public String getRechargeNumber() {
        return rechargeNumber;
    }

    public void setRechargeNumber(String rechargeNumber) {
        this.rechargeNumber = rechargeNumber;
    }

    public String getRechargePrice() {
        return rechargePrice;
    }

    public void setRechargePrice(String rechargePrice) {
        this.rechargePrice = rechargePrice;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", rechargeType='" + rechargeType + '\'' +
                ", rechargeEmail='" + rechargeEmail + '\'' +
                ", rechargeName='" + rechargeName + '\'' +
                ", rechargePlan='" + rechargePlan + '\'' +
                ", rechargeNumber='" + rechargeNumber + '\'' +
                ", rechargePrice='" + rechargePrice + '\'' +
                '}';
    }
}

