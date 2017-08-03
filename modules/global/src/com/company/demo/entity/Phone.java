package com.company.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("%s|number")
@Table(name = "DEMO_PHONE")
@Entity(name = "demo$Phone")
public class Phone extends StandardEntity {
    private static final long serialVersionUID = 4622729610193370995L;

    @Column(name = "TYPE_")
    protected String type;

    @Column(name = "NUMBER_")
    protected String number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMER_DETAILS_ID")
    protected CustomerDetails customerDetails;

    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }


}