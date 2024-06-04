import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements execute {
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;
    int emp_salary;
    String emp_showroom;
    Long emp_mobile_number;
    String emp_adress;

    @Override
    public void get_details(){
        System.out.println("Id: "+emp_id);
        System.out.println("Name: "+emp_name);
        System.out.println("Age: "+emp_age);
        System.out.println("Department: "+emp_department);
        System.out.println("Salary: "+emp_salary);
        System.out.println("Showroom: "+emp_showroom);
        System.out.println("Mobile Number: "+emp_mobile_number);
        System.out.println("Adress: "+emp_adress);
    }

    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);
        System.out.println("======================= *** ENTER EMPLOYEE DETAILS *** =======================");
        System.out.println();
        System.out.print("Employee Name: ");
        emp_name = sc.nextLine();
        System.out.print("Employee Age: ");
        emp_age = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Employee Department: ");
        emp_department = sc.nextLine();
        System.out.print("Employee Salary: ");
        emp_salary = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Employee Showroom: ");
        emp_showroom = sc.nextLine();
        System.out.print("Employee Mobile Number: +91 ");
        emp_mobile_number = sc.nextLong();
        sc.nextLine(); 
        System.out.print("Employee Adress: ");
        emp_adress = sc.nextLine();
    }
    
}
