package com.devsuperior.uri2602.DTO;

import com.devsuperior.uri2602.projections.CustomerMinProjection;

public class CustomerMinDTO {

    private String name;


   public CustomerMinDTO(){}
        

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public CustomerMinDTO(CustomerMinProjection projection){
        name = projection.getName();
    }


    @Override
    public String toString() {
        return "CustomerMinDTO [name=" + name + ", getName()=" + getName() + "]";
    }
  
    

}