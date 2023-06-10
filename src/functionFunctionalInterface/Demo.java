package functionFunctionalInterface;

import java.util.function.Function;

/*

Function <InputType, ReturnType> name = (f) -> {statement};

 */


public class Demo {
    public static void main(String[] args) {
        
        Function <Integer, Integer> function = (f) -> f * f;
        System.out.println(function.apply(5));

        Function <String, Integer> function2 = (f) -> f.length();
        System.out.println(function2.apply("ryanraushan"));
    }
}
