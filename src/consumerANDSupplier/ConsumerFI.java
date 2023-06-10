package consumerANDSupplier;

import java.util.function.Consumer;

public class ConsumerFI {
    public static void main(String[] args) {
        Consumer<String> consumer = (e) -> System.out.println(e);
        consumer.accept("Hello");

        Consumer<String> c1 = (e) -> System.out.println(e + " is white.");
        Consumer<String> c2 = (e) -> System.out.println(e + " has 4 leg.");
        Consumer<String> c3 = (e) -> System.out.println(e + " on the road.");

        // 1st method
        c1.accept("cow");
        c2.accept("cow");
        c3.accept("cow");
        

        // or function  chain
        c1.andThen(c2).andThen(c3).accept("cow");

        //or 
        Consumer <String> c4 = c1.andThen(c2).andThen(c3);
        c4.accept("cow");


    }
}
