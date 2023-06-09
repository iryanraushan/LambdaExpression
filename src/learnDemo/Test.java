package learnDemo;

@FunctionalInterface
interface Cab {

    public void bookCab();
    
}

class Ola implements Cab{
    public void bookCab(){
        System.out.println("you cab is booked..");
    }

    // LAMBDA EXPRESSION
    // () -> System.out.println("cab is booked")
}

public class Test {
    public static void main(String[] args) throws Exception {

        Ola ola = new Ola();
        ola.bookCab();


        Cab ola2 = new Ola();
        ola2.bookCab();
    }
}
