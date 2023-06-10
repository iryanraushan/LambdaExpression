package functionFunctionalInterface;

import java.util.ArrayList;
import java.util.function.Function;

class Empl {
    String name;
    int salary;

    Empl(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Employee {

    public static void main(String[] args) {
        ArrayList<Empl> empList = new ArrayList<>();
        empList.add(new Empl("Ryan", 1000000));
        empList.add(new Empl("sANTOSH", 20000));
        empList.add(new Empl("Shivam", 50000));
        empList.add(new Empl("ravan", 500000));
        empList.add(new Empl("piyush", 150000));
        empList.add(new Empl("lund", 500000));

        Function<Empl, Integer> function = (e) -> {
            int s = e.salary;
            if (s >= 20000 && s <= 30000) {
                return s * 10 / 100;
            } else if (s > 30000) {
                return s * 5 / 100;
            } else {
                return s;
            }
        };

        for (Empl emp : empList) {
            System.out.println(
                    " name : " + emp.name +
                    " || salary : " + emp.salary +
                    " || bonus : " + function.apply(emp)
            );
        }
    }
}
