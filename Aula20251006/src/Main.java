import entities.Employee;
import utils.Date;

public class Main {
    public static void main(String[] args) {
        Date birtDate = new Date(4, 23, 1984);
        Date hireDate = new Date(7, 21, 2023);
        Employee employee = new Employee("Wellington", "Menezes", birtDate, hireDate);

        System.out.println(employee);
    }
}
