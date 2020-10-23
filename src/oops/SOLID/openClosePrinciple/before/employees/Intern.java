package oops.SOLID.openClosePrinciple.before.employees;

public class Intern extends Employee {
    public Intern(String fullName, int monthlyIncome, int nbHours) {
        super(fullName, monthlyIncome);
        setNbHoursPerWeek(nbHours);
        this.setType(3);
    }
}
