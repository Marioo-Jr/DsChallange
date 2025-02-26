package com.devsuperior.PrimeiroDesafio.services;

import com.devsuperior.PrimeiroDesafio.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {


    @Autowired
    private ShippingService shippingService;


    // metodo para poder fornecer o valor do desconto como 10% e nao 0.10, o metodo faz a conversao :)
    public double getDescontoDecimal(Order desconto){
        return desconto.getDiscount() / 100.0;
    }


    public Double total(Order order){
        double discount = getDescontoDecimal(order);

        return  (order.getBasic() - (order.getBasic() * discount)) + shippingService.shipment(order);
    }
}
