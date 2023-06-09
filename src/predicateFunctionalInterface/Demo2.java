package predicateFunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
    String name;
    int salary;
    int exprience;

    Employee(String name, int salary, int exprience) {
        this.name = name;
        this.salary = salary;
        this.exprience = exprience;
    }
}

public class Demo2 {
    public static void main(String[] args) {

        // Create Lambda expression to check the condition if salary > 50000 and
        // exprience > 3
        Predicate<Employee> predicate = (e) -> (e.salary > 50000 && e.exprience > 3);

        Employee emp = new Employee("ryan", 600000, 4);
        System.out.println(predicate.test(emp));

        Employee emp2 = new Employee("raushan", 40000, 2);
        System.out.println(predicate.test(emp2));

        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("david dhawan", 1000000, 10));
        list.add(new Employee("david dhawan", 20000, 2));
        list.add(new Employee("david dhawan", 45000, 1));
        list.add(new Employee("david dhawan", 700000, 0));
        list.add(new Employee("david dhawan", 300000, 0));
        list.add(new Employee("david dhawan", 000000, 5));
        list.add(new Employee("david dhawan", 100000000, 6));

        for (Employee employee : list) {

            if (predicate.test(employee)) {
                System.out.println("name " + employee.name + ", salary : " + employee.salary + ", exprence : "
                        + employee.exprience);
            }

        }
    }
}
