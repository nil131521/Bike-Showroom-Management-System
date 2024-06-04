import java.util.*;
import java.lang.*;

interface execute{
    public void get_details();
    public void set_details();
}


public class Main {

    static void main_menu(){
        System.out.println();
        System.out.println("======================= *** WELCOME TO BIKE0 SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD BIKE \t\t\t 3].ADD EMPLOYEES \t\t\t 4].ADD CUSTOMER");
        System.out.println();
        System.out.println("5].GET SHOWROOMS \t\t\t 6].GET BIKE \t\t\t 7].GET EMPLOYEES \t\t\t 8].GET CUSTOMER");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[7];
        Bike bike[] = new Bike[7];
        Employees employee[] = new Employees[7];
        Customer customer[] = new Customer[7];
        int showroom_counter = 0;
        int bike_counter = 0;
        int employees_counter = 0;
        int customer_counter = 0;
        int choice = 100;
        while(choice!=0){

            main_menu();
            choice = sc.nextInt();

            while(choice!=9 && choice!=0){
                switch (choice) {
                    case 1:
                        showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1].ADD NEW SHOWROOM");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        bike[bike_counter] = new Bike();
                        bike[bike_counter].set_details();
                        bike_counter++;
                        System.out.println();
                        System.out.println("2].ADD NEW BIKE");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        employee[employees_counter] = new Employees();
                        employee[employees_counter].set_details();
                        employees_counter++;
                        System.out.println();
                        System.out.println("3].ADD NEW EMPLOYEES");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        customer[customer_counter] = new Customer();
                        customer[customer_counter].set_details();
                        customer_counter++;
                        System.out.println();
                        System.out.println("4].ADD NEW CUSTOMER");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < showroom_counter; i++) {
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for (int i = 0; i < bike_counter; i++) {
                            bike[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 7:
                        for (int i = 0; i < employees_counter; i++) {
                            employee[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 8:
                        for (int i = 0; i < customer_counter; i++) {
                            customer[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE");
                        break;

                }
            }
        }
    }
}

    

