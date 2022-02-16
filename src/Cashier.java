import java.text.SimpleDateFormat;
import java.util.*;

public class Cashier {
    private Map<Product,Float> products = new LinkedHashMap<Product,Float>();

    public void add_product(Product p,Float quantity){
        this.products.put(p,quantity);

    }

    public float print_receipt(Date date){
        Float subtotal = Float.valueOf(0);
        Float discount = Float.valueOf(0);
        Float total = Float.valueOf(0);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String datefmt = simpleDateFormat.format(date);

        System.out.printf("Date: %s \n ---Products--- \n", datefmt);

        for(Product prod : products.keySet()){
            Float quantity = products.get(prod);
            System.out.printf("%s %s \n", prod.getName(), prod.getBrand());


            subtotal += prod.getPrice()*quantity;
            System.out.printf("%.2f x $%.2f = $%.2f \n",quantity,prod.getPrice(),quantity*prod.getPrice());

            Float discount_curr = prod.generate_discounts(date);
            if (discount_curr != 0) {
                System.out.printf("#discount %.0f%% -$%.2f  \n",discount_curr*100,discount_curr*prod.getPrice()*quantity);

            }
            discount += discount_curr*quantity*prod.getPrice();



        }

        total = subtotal - discount;
        System.out.printf("--------------------- \nSUBTOTAL:$%.2f  \nDISCOUNT:-$%.2f \n\nTOTAL:$%.2f \n",subtotal,discount,total);
        return Float.valueOf(0);
    }

}
