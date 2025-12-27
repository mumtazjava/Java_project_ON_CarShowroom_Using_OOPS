import java.util.Scanner;
import java.sql.SQLOutput;



public class Showroom implements utility{

 String showroom_name;
 String showroom_address;
 int total_employees;
 int total_carInStock=0;
 String manager_name;


 public void get_details(){
     System.out.println("showroom_name: "+showroom_name);
     System.out.println("showroom_addres: "+showroom_address);
     System.out.println("total_employees "+total_employees);
     System.out.println("total_carInStock: "+total_carInStock);
     System.out.println("manager_name"+manager_name);
 }
 public void set_details(){
     Scanner sc=new Scanner(System.in);
     System.out.println("==================================  *** ENTER SHOWROOM DETAILS          ***        ===========================");
     System.out.println();
     System.out.println("showroom_name: ");
     showroom_name=sc.nextLine();
     System.out.println("showroom_address: ");
     showroom_address=sc.nextLine();
     System.out.println("manager_name:");
     manager_name=sc.nextLine();

     System.out.println("total_employees ");
     total_employees=sc.nextInt();
     System.out.println("total_carInStock: ");
     total_carInStock=sc.nextInt();




 }














}
