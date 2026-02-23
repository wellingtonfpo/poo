package composicao;

public class EmployeeTest {
    static void main() {

        Date birth_employee1 = new Date(12, 24, 2000);
        Date hire_employee1 = new Date(2, 12, 2020);

        Date birth_employee2 = new Date(12, 24, 2000);
        Date hire_employee2 = new Date(2, 12, 2020);


        Employee employee1 = new Employee("Jane", "Smith", birth_employee1, hire_employee1);
        Employee employee2 = new Employee("Jane", "Smith", birth_employee2, hire_employee2);

        System.out.println(employee1);
        System.out.println(employee2);

        System.out.printf("Total employees: %d%n", Employee.getCount());


    }
}
