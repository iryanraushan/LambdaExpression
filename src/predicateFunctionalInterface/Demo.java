package predicateFunctionalInterface;

import java.util.function.Predicate;

public class Demo {

    public static void main(String[] args) {

        // Exapmle 01
        Predicate <Integer> p = (i) -> (i > 10);

        System.out.println(p.test(20));
        System.out.println(p.test(5));


        // Example 02
        Predicate <String> predicate = (str) -> (str.length() > 7);
        
        System.out.println(predicate.test("xyzhmnopr"));
        System.out.println(predicate.test("ryan"));

        
        // 03 print element whose size is > 7
        String[] names ={"ryan", "mnbvcxz", "yewtruewtrew", "sjgfhdsgds"};

        for (String string : names) {
            if(predicate.test(string)){
                System.out.println(string);
            }
        }

    }
    
}
