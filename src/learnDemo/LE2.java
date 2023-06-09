package learnDemo;

/*
 @FunctionalInterface
interface Cab{

    public void bookCab(String source, String Destination);

}

class Ola implements Cab{

    public void bookCab(String source, String destination){
        System.out.println("Your cab is booked from " + source + " to " + destination + ".");
    }

} 
*/

@FunctionalInterface
interface Cab{

    public int bookCab(String source, String Destination);

}

/*
class Ola implements Cab{

    public int bookCab(String source, String destination){
        System.out.println("Your cab is booked from " + source + " to " + destination + ".");
        return 500;
    }

} 
 */

public class LE2 {
    public static void main(String[] args) throws Exception{

        /*
        Cab cab = (source, destination) -> System.out.println("Your cab is booked from " + source + " to " + destination + "."); 
        cab.bookCab("Purnea", "Patna");

         */

        Cab cab = (source, destination) -> {
           System.out.print("Your cab is booked from " + source + " to " + destination + ".");
           return 500;
        };

        int rup = cab.bookCab("Patna", "Hridwar");
        System.out.println(" And You Have to pay " + rup + ".");
               
    }
}
