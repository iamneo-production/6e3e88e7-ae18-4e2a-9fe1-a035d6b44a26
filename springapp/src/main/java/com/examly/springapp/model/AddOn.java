package com.examly.springapp.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="AddOn")
public class AddOn implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;
    private String planName;
    private String planPrice;
    private String planType;
    private String planValidity;
    private String planDescription;


    public AddOn(){ }

    public AddOn(long id, String planName, String planPrice, String planType, String planValidity, String planDescription) {
        this.id = id;
        this.planName = planName;
        this.planPrice = planPrice;
        this.planType = planType;
        this.planValidity = planValidity;
        this.planDescription = planDescription;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getPlanPrice() {
        return planPrice;
    }

    public void setPlanPrice(String planPrice) {
        this.planPrice = planPrice;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }


    public String getPlanValidity() {
        return planValidity;
    }

    public void setPlanValidity(String planValidity) {
        this.planValidity = planValidity;
    }

    public String getPlanDescription() {
        return planDescription;
    }

    public void setPlanDescription(String planDescription) {
        this.planDescription = planDescription;
    }

    @Override
    public String toString() {
        return "AddOn{" +
                "id=" + id +
                ", planName='" + planName + '\'' +
                ", planPrice='" + planPrice + '\'' +
                ", planType='" + planType + '\'' +
                ", planValidity='" + planValidity + '\'' +
                ", planDescription='" + planDescription + '\'' +
                '}';
    }
}

