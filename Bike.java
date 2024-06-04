import java.util.Scanner;

public class Bike extends Showroom implements execute {
    String bike_name;
    String bike_color;
    String bike_fuel_type;
    int bike_price;
    String bike_type;
    String bike_engine_type;
    int bike_mileage;
    int bike_weight;
    int bike_fueltank_capasity;
    int bike_engine_capasity;

    @Override
    public void get_details(){
        System.out.println("Bike Name: "+bike_name);
        System.out.println("Bike Color: "+bike_color);
        System.out.println("Bike Fuel Type: "+bike_fuel_type);
        System.out.println("Bike Price: "+bike_price);
        System.out.println("Bike Type: "+bike_type);
        System.out.println("Bike Engine Type: "+bike_engine_type);
        System.out.println("Bike Mileage: "+bike_mileage);
        System.out.println("Bike Weight: "+bike_weight);
        System.out.println("Bike Fueltank Capasity: "+bike_fueltank_capasity);
        System.out.println("Bike Engine Capasity: "+bike_engine_capasity);
    }

    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER BIKE DETAILS *** =======================");
        System.out.println();
        System.out.print("Bike Name: ");
        bike_name = sc.nextLine();
        System.out.print("Bike Color: ");
        bike_color = sc.nextLine();
        System.out.print("Bike Fuel Type: ");
        bike_fuel_type = sc.nextLine();
        System.out.print("Bike Price: ");
        bike_price = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Bike Type: ");
        bike_type = sc.nextLine();
        System.out.print("Bike Engine Type: ");
        bike_engine_type = sc.nextLine();
        System.out.print("Bike Mileage: ");
        bike_mileage = sc.nextInt();
        System.out.print("Bike Weight: ");
        bike_weight = sc.nextInt();
        System.out.print("Bike Fueltank Capasity: ");
        bike_fueltank_capasity = sc.nextInt();
        System.out.print("Bike Engine Capasity: ");
        bike_engine_capasity = sc.nextInt();
    }
}
