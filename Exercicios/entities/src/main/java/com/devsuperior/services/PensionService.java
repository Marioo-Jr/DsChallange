package com.devsuperior.services;


import org.springframework.stereotype.Service;

@Service
public class PensionService {


    public static double discount(double amount){
        return amount * 0.1;

    }
}
