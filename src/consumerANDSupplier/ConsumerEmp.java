package consumerANDSupplier;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
    String name;
    int salary;
    String gender;

    Employee(String name, int salary, String gender) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }
}

public class ConsumerEmp {

    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Ryan", 1000, "male"));
        empList.add(new Employee("sANTOSH", 200, "male"));
        empList.add(new Employee("Shivam", 1000, "male"));
        empList.add(new Employee("rani", 50100, "female"));
        empList.add(new Employee("ravan", 5000000, "male"));
        empList.add(new Employee("fulmati", 51000, "female"));
        empList.add(new Employee("dayamati", 51000, "female"));
        empList.add(new Employee("kamlesh", 51000, "male"));
        empList.add(new Employee("piyush", 1500, "male"));
        empList.add(new Employee("fulkumari", 50000, "male"));

        // Function Used.
        Function<Employee, Integer> function = (e) -> {
            int s = e.salary;
            if (s >= 20000 && s <= 30000) {
                return s * 10 / 100;
            } else if (s > 30000) {
                return s * 5 / 100;
            } else {
                return s;
            }
        };

        // Predicate
        Predicate<Integer> predicate = (e) -> (e > 2000);

        // Consumer
        Consumer<Employee> consumer = (emp) -> {
            System.out.println(
                    " name : " + emp.name +
                            " || Gender : " + emp.gender +
                            " || salary : " + emp.salary +
                            " || bonus : " + function.apply(emp));
        };

        for (Employee employee : empList) {
            int bonus = function.apply(employee);

            if (predicate.test(bonus)) {
                consumer.accept(employee);
            }
        }

    }
}
