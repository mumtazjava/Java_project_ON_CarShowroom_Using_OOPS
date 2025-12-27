import java.util.Scanner;

public class Cars extends Showroom implements utility {
 String car_name;
 String car_color;
 String car_fuel_type;
 int car_price;

 String car_type;

 String car_transmission;
 public void get_details(){
     System.out.println("car_name: "+car_name);
     System.out.println("car_color: "+car_color);
     System.out.println("car_fuel_type"+car_fuel_type);
     System.out.println("car_price: "+car_price);
     System.out.println("car_price"+car_type);
     System.out.println("car_transmission"+car_transmission);





 }
 public void set_details(){
     Scanner sc=new Scanner(System.in);
     System.out.println("==================================  *** ENTER Cars DETAILS          ***        ===========================");
     System.out.println();
     System.out.println("car_name: ");
     car_name=sc.nextLine();
     System.out.println("car_color: ");
     car_color=sc.nextLine();
     System.out.println("car_fuel_type(Petrol/Diesle):");
     car_fuel_type=sc.nextLine();

     System.out.println("car_price");
     car_price=sc.nextInt();
     sc.nextLine();
     System.out.println("car_type: ");
     car_type=sc.nextLine();
     System.out.println("Transmission Type(Autimatic/manual)");
     car_transmission=sc.nextLine();
     total_carInStock++;






 }







}
