package services;

// essa classe extende a superclasse TaxService.
public class BrazilTaxService extends TaxService{

    @Override
    public double tax (double amount) {
        return amount * 0.3;
    }

}
