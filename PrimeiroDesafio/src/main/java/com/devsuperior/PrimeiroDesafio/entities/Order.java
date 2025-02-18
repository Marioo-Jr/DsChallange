package com.devsuperior.PrimeiroDesafio.entities;

public class Order {

    private Integer code;
    private Double basic;
    private  Double discount;

    public Order (){

    }


    public Order(Integer code, Double basic ,Double discount) {
        this.code = code;
        this.discount = discount;
        this.basic = basic;

    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getBasic() {
        return basic;
    }

    public void setBasic() {
        this.basic = basic;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
