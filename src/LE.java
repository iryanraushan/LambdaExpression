@FunctionalInterface
interface Cab {

    public void bookCab();
    
}

public class LE {
    public static void main(String[] args) {

        Cab cab = () -> System.out.println("cab is booked...");

        cab.bookCab();
    }
}
