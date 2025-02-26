package com.devsuperior.services;

import com.devsuperior.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {

    @Autowired
    private TaxServices taxServices;
    @Autowired
    private PensionService pensionService;


    public static double netSalary(Employee employee){
        return employee.getGrossSalary() - TaxServices.tax(employee.getGrossSalary())
                - PensionService.discount(employee.getGrossSalary());

    }
}
