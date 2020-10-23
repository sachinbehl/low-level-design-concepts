package oops.SOLID.openClosePrinciple.before.taxes;

import javax.lang.model.util.ElementScanner6;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class TaxCalculator {
    

    public double calculate(Employee employee) {
        return 0;
    }
}

/*
Taxes for

employees are
calculated like this:

1)
For full
time employees

-30%
income tax-2%
professional tax-1%
education cess

2)
For part
time employees

-20%
income tax-3%
professional tax-1%
educational cess

3)
For interns-
If annual income<300000=>
no tax-Else=>only 15%
income tax
*/
 class TaxCalculatorFT extends TaxCalculator {
    private final static int INCOME_TAX_PERCENTAGE = 30;
    private final static int PROFESSIONAL_TAX_PERCENTAGE = 1;

    public  double calculate(Employee employee) {
        return employee.getMonthlyIncome() * (INCOME_TAX_PERCENTAGE + PROFESSIONAL_TAX_PERCENTAGE)/100;
    }

}

 class TaxCalculatorPT extends TaxCalculator {
    private final static int INCOME_TAX_PERCENTAGE = 20;
    private final static int PROFESSIONAL_TAX_PERCENTAGE = 1;
    
    public double calculate(Employee employee) {
        return employee.getMonthlyIncome() * (INCOME_TAX_PERCENTAGE + PROFESSIONAL_TAX_PERCENTAGE) / 100;
    }

}

 class TaxCalculatorIntern extends TaxCalculator {
    private final static int INCOME_TAX_PERCENTAGE = 15;
    private final static int PROFESSIONAL_TAX_PERCENTAGE = 0;

    public double calculate(Employee employee) {
        if (employee.getMonthlyIncome() <= 30000)
            return 0;
        return employee.getMonthlyIncome() * (INCOME_TAX_PERCENTAGE + PROFESSIONAL_TAX_PERCENTAGE) / 100;
    }

}

