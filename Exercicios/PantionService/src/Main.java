import entities.Employee;
import services.BrasilTaxService;
import services.PensionService;
import services.SalaryService;
import services.TaxServices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("Salario bruto: ");
        double grossSalary = sc.nextDouble();

        PensionService pensionService = new PensionService();
        TaxServices taxServices = new BrasilTaxService();
        SalaryService salaryService = new SalaryService(taxServices, pensionService);

        Employee employee = new Employee(name, grossSalary);
        double netSalary = SalaryService.netSalary(employee);

        System.out.println("Salario liquido = " + netSalary);



    }
}