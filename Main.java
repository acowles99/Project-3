import java.util.Scanner;

class Main 
{

  public static void main(String[] args) {
   int [] seatNumbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
   String [] element = {"Fast", "Adventurous", "Daring", "Happy", "Intellegent", "Patient","Skillful", "Mighty", "Dedicated","Creative","Loyal", "Humble", "Wise", "Tall", "Elegant"};
   //elements

   Scanner scan = new Scanner (System.in);
   System.out.println("Please enter your name");
   String name = scan.next();
   for(int i = 0; i < 15; i++)
   {
    System.out.println(element[i] + " " + name);
   }
   
   
  }
}