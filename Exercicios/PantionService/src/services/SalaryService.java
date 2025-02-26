package services;
import entities.Employee;

public class SalaryService {

    private TaxServices taxServices;
    private PensionService pensionService;

    public SalaryService (TaxServices taxServices, PensionService pensionService){
        this.pensionService = pensionService;
        this.taxServices = taxServices;
    }


    public static double netSalary(Employee employee){
        return employee.getGrossSalary() - TaxServices.tax(employee.getGrossSalary())
                - PensionService.discount(employee.getGrossSalary());

    }
}
