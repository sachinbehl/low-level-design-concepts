package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.taxes.TaxCalculator;
public class TaxCalculatorFactory {

    public static TaxCalculator getTaxCalculator(Employee e) {
        if (e.getType() == 1)
            return new TaxCalculatorFT();
        else if (e.getType() == 2)
            return new TaxCalculatorPT();
        else
            return new TaxCalculatorIntern();
    }

}