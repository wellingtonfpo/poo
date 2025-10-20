import v3.*;

public class Main {
    public static void main(String[] args) {
        // create objects of subclasses
        SalariedEmployee salariedEmployee =
                new SalariedEmployee("Wellington", "Menezes", "111-11-1111", 800.0);

        HourlyEmployee hourlyEmployee =
                new HourlyEmployee("Ana", "Silva", "222-22-2222", 16.75, 40);

        CommissionEmployee commissionEmployee =
                new CommissionEmployee("Carlos", "Santos", "333-33-3333", 10000.0, 0.06);

        BasePlusCommissionEmployee basePlusCommissionEmployee =
                new BasePlusCommissionEmployee("Maria", "Oliveira", "444-44-4444", 5000, 0.04, 300.0);

        System.out.println("Employees processed individually:");

        System.out.printf("%n%s%n%s: $%.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());

        //create array of Employee references
        Employee[] employees = new Employee[4];

        // initialize array with Employees
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.println("Employees processed polymorphically:");
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);

            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee =
                        (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf("new base salary with 10%% increase is: $%.2f%n", employee.getBaseSalary());
            } // end if
            System.out.printf("earned $%.2f%n%n", currentEmployee.earnings());
        } // end for
        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
        }
    } // end main
}
