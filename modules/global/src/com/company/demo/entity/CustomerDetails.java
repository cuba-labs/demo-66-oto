package com.company.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Lob;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@NamePattern("#getCaption|address,comments")
@Table(name = "DEMO_CUSTOMER_DETAILS")
@Entity(name = "demo$CustomerDetails")
public class CustomerDetails extends StandardEntity {
    private static final long serialVersionUID = -1461243670729044260L;

    @Column(name = "ADDRESS")
    protected String address;

    @Lob
    @Column(name = "COMMENTS")
    protected String comments;

    @OrderBy("number")
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "customerDetails")
    protected List<Phone> phones;

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<Phone> getPhones() {
        return phones;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getComments() {
        return comments;
    }

    public String getCaption() {
        return "<details are set>";
    }
}