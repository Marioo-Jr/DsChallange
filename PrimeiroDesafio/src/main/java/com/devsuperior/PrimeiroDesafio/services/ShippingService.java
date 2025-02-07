package com.devsuperior.PrimeiroDesafio.services;

import com.devsuperior.PrimeiroDesafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {



    public Double shipment(Order order){
        double shippingAndOrder = order.getBasic();
        double shipping = 0;
        if (shippingAndOrder < 100){

            shipping += 20;
            return shipping;
        }

        else if (order.getBasic() >=100 && order.getBasic()< 200) {

            shipping += 12;
            return shipping;
        }

        else if (shippingAndOrder >= 200)

            shipping += 0;
        return shipping;
    }
}