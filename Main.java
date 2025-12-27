import java.util.*;
import java.lang.*;
interface utility{
  public void get_details();
  public void set_details();
}


public class Main {
    static void main_menu(){

        System.out.println();
        System.out.println("================  *** WELCOME TO SHOROOM MANEGMENT SYSTEM  ***  =================");
        System.out.println();
        System.out.println("======         ***   ENTER YOUR CHOICE     ***    ======");
        System.out.println();
        System.out.println("1)ADD SHOROOMS \t\t\t 2) ADD EMOLOYEES \t\t\t 3)ADD Cars ");
        System.out.println();
        System.out.println("4) GET SHOWROOM \t\t\t 5)GET EMOLOYEES \t\t\t 6) GET CARDS");
        System.out.println();
        System.out.println("======== ** ENTER 0 TO EXIT  ***) ======");




    }
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        Showroom showroom[]=new Showroom[5];
        Employees employees[]=new Employees[5];
        Cars cars[]=new Cars[5];
        int cars_counter =0;
        int showroom_counter =0;
        int employees_counter=0;
        int choice =100;
        while(choice !=0){
            main_menu();
            choice=sc.nextInt();
            while(choice!=9 && choice !=0){
                switch (choice){
                    case 1:
                        showroom[showroom_counter]=new Showroom();
                        showroom[showroom_counter ].set_details();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1) to add new showroom");
                        System.out.println("9) TO GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        employees[employees_counter]=new Employees();
                        employees[employees_counter].set_details();
                        employees_counter++;
                        System.out.println();
                        System.out.println("2) To Add New Employees");
                        System.out.println("9) TO GO BACK TO MAIN MENU");
                        choice=sc.nextInt();
                        break;
                    case 3:
                        cars[cars_counter]=new Cars();
                        cars[cars_counter].set_details();
                        cars_counter++;
                        System.out.println();
                        System.out.println("1) to add new showroom");
                        System.out.println("9) TO GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for(int i=0; i < showroom_counter; i++){
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9). GO Back TO Main Menu");
                        System.out.println("0) EXIT");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for(int i=0; i <employees_counter; i++){
                            employees[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9). GO Back TO Main Menu");
                        System.out.println("0) EXIT");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for(int i=0; i <cars_counter; i++){
                            cars[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9). GO Back TO Main Menu");
                        System.out.println("0) EXIT");
                        choice = sc.nextInt();
                        break;

                    default:
                        System.out.println("Enter valid Choice");
                        break;





                }
            }
        }
    }



}
