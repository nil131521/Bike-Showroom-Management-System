import java.sql.SQLOutput;
import java.util.Scanner;
public class Showroom implements execute{
    
    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_bike_in_stock = 0;
    String manager_name;

    @Override
    public void get_details() {
        System.out.println("Showroom Name: " +showroom_name);
        System.out.println("Showroom Adress: " +showroom_address);
        System.out.println("Total Employees: " +total_employees);
        System.out.println("Total Bike In Stock: " +total_bike_in_stock);
        System.out.println("Manager Name: " +manager_name);
    }
    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER SHOWROOM DETAILS *** =======================");
        System.out.println();
        System.out.print("Showroom Name: ");
        showroom_name = sc.nextLine();
        System.out.print(("Showroom Address: "));
        showroom_address = sc.nextLine();
        System.out.print("Total Employees: ");
        total_employees = sc.nextInt();
        System.out.print("Total Bike In Stock: ");
        total_bike_in_stock = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Manager Name: ");
        manager_name = sc.nextLine();
    }
}
