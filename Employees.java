import java.util.Scanner;
import java.util.UUID;


public class Employees extends Showroom implements utility {

  String employId;
  String employName;
  int employAge;
  String employDepartment;

 public void get_details (){
     System.out.println("employId: "+employId);
     System.out.println("employName: "+employName);
     System.out.println("employAge "+employAge);
     System.out.println("employDepartment: "+employDepartment);
     System.out.println("showroom_name"+showroom_name);

  }
 public void set_details(){

     Scanner sc=new Scanner(System.in);
     UUID uuid=UUID.randomUUID();
     employId = String.valueOf(uuid);

     System.out.println("==================================  *** ENTER EMPLOYEES DETAILS          ***        ===========================");
     System.out.println();
     System.out.println("employName: ");
     employName=sc.nextLine();
     System.out.println("employAge: ");
     employAge=sc.nextInt();
     sc.nextInt();
     System.out.println("employDepartment:");
     employDepartment=sc.nextLine();

     System.out.println("showroom_name: ");
     showroom_name=sc.nextLine();




 }



}
