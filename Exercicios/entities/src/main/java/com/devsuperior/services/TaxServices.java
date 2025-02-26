package com.devsuperior.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class TaxServices {

    public static double tax(double amount){
        return amount * 0.2;

    }


}
