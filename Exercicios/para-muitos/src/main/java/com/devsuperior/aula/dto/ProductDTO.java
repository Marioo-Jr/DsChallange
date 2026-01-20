package com.devsuperior.aula.dto;

import java.util.ArrayList;
import java.util.List;

import com.devsuperior.aula.entities.Category;
import com.devsuperior.aula.entities.Product;

public class ProductDTO {  

    private Long id;
    private String name;
    private Double prices;

    private List<CategoryDTO>categories = new ArrayList<>();


    public ProductDTO (){}


    public ProductDTO(Long id, String name, Double prices) {
        this.id = id;
        this.name = name;
        this.prices = prices;
    }

    public ProductDTO (Product entity){

        id = entity.getId();
        name = entity.getName();
        prices = entity.getPrice();

        for (Category cat: entity.getCategories()){

            categories.add(new CategoryDTO(cat));

        }
    }


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


    public Double getPrices() {
        return prices;
    }


    public void setPrices(Double prices) {
        this.prices = prices;
    }


    public List<CategoryDTO> getCategories() {
        return categories;
    }


    public void setCategories(List<CategoryDTO> categories) {
        this.categories = categories;
    }


    

}
