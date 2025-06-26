package com.ecommerceJava.ecommerce.services;


import com.ecommerceJava.ecommerce.dto.ProductDTO;
import com.ecommerceJava.ecommerce.entities.Product;
import com.ecommerceJava.ecommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(long id) {
        Optional<Product> result  = repository.findById(id);
        Product product = result.get();
        ProductDTO dto = new ProductDTO(product);
        return dto;

    }

    @Transactional(readOnly = true)
    public Page<ProductDTO> findALL(Pageable pageable) {
        Page<Product> result = repository.findAll(pageable);
        //return result.stream().map(x -> new ProductDTO(x)).toList();
        return result.map(x -> new ProductDTO(x));


    }


    @Transactional
    public ProductDTO insert (ProductDTO dto) {

        Product entity = new Product();
        copyDtoToEntity(dto,entity); // usando o metodo copyDtoToEntity pro codigo nao ficar repetitivo
//        entity.setName(dto.getName());
//        entity.setDescription(dto.getDescription());
//        entity.setPrice(dto.getPrice());
//        entity.setImgUrl(dto.getImgUrl());
        entity = repository.save(entity);
        return new ProductDTO(entity);



    }


    @Transactional()
    public ProductDTO update (Long id,ProductDTO dto) {
        Product entity = repository.getReferenceById(id); // pega a referencia do id que eu passar, sem ir no BD
        copyDtoToEntity(dto,entity);
        return new ProductDTO(entity);

    }

    @Transactional
    public void  delete (long id) {
        repository.deleteById(id);
    }


    private void copyDtoToEntity(ProductDTO dto, Product entity) {
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setPrice(dto.getPrice());
        entity.setImgUrl(dto.getImgUrl());
    }


}
