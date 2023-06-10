package consumerANDSupplier;

import java.util.Date;
import java.util.function.Supplier;

/**
 * Supplier
 */
public class SupplierFI {

    public static void main(String[] args) {
        
        Supplier <Date> supplier = ()-> new Date();

        System.out.println(supplier.get());
    }
}