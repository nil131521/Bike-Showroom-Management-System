import java.util.Scanner;
import java.util.UUID;

public class Customer extends Showroom implements execute {
    String cus_id;
    String cus_name;
    int cus_age;
    String cus_address;
    Long cus_mobile_number;
    String cus_bike_name;
    String cus_payment;

    @Override
    public void get_details(){
        System.out.println("Id: "+cus_id);
        System.out.println("Name: "+cus_name);
        System.out.println("Age: "+cus_age);
        System.out.println("Address: "+cus_address);
        System.out.println("Mobile Number: "+cus_mobile_number);
        System.out.println("Bike Name: "+cus_bike_name);
        System.out.println("Payment Method: "+cus_payment);
        

    }
    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        cus_id = String.valueOf(uuid);
        System.out.println("======================= *** ENTER CUSTOMER DETAILS *** =======================");
        System.out.println();
        System.out.print("Customer Name: ");
        cus_name = sc.nextLine();
        System.out.print("Customer Age: ");
        cus_age = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Customer Address: ");
        cus_address = sc.nextLine();
        System.out.print("Customer Mobile Number: +91 ");
        cus_mobile_number = sc.nextLong();
        sc.nextLine(); 
        System.out.print("Customer Bike Name: ");
        cus_bike_name = sc.nextLine();
        System.out.print("Customer Payment Method: ");
        cus_payment = sc.nextLine();
    }
}
