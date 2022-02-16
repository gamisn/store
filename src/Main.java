import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        Cashier cashier = new Cashier();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Perishable Apple = new Perishable("apple","BrandA",1.5F,formatter.parse("2021-06-14"));
        Perishable Milk =  new Perishable("milk","BrandM",0.99F,formatter.parse("2022-02-02"));
        Clothes TShirt =  new Clothes("T-shirt","BrandT",15.99F,"M","violet");
        //here formatter.parse("2021-06-14 12:34:56")
        Appliances laptop = new Appliances("laptop","BrandL",Float.valueOf(2345),"ModelL",formatter.parse("2021-03-03"),Float.valueOf(1.125F));

        cashier.add_product(Apple,Float.valueOf((float) 2.45));
        cashier.add_product(Milk,Float.valueOf(3));
        cashier.add_product(TShirt,Float.valueOf(2));
        cashier.add_product(laptop,Float.valueOf(1));
        formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = formatter.parse("2021-06-14 12:34:56");

        cashier.print_receipt(date);


    }
}
