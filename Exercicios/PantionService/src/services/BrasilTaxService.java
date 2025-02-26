package services;

public class BrasilTaxService extends TaxServices{


    public static double tax(double amount){

        return amount * 0.3;

    }


}
