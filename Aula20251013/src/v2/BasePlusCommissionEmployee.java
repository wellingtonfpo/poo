package v2;

import v1.CommissionEmployee;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName,
                                      String socialSecurityNumber,
                                      double grossSales, double commissionRate, double baseSalary) {

        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings() {
        // não permitido: commissionRate e grossSales são privados na superclasse
        // return baseSalary + (commissionRate * grossSales);

        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    }
}
