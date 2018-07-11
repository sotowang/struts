package com.how2java.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.soto.bean.Product;

@Namespace("/")
@ParentPackage("struts-default")
@Results({@Result(name="show", location="/show.jsp"),
        @Result(name="home", location="/index.jsp")})

public class ProductAction {
    private Product product;
    @Action("showProduct")
    public String show() {
        product = new Product();
        product.setName("iphone7");
        return "show";
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}