import java.util.Scanner;

class Main 
{

  public static void main(String[] args) {
   int [] seatNumbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
   String [] names = new String [15];
   //elements

   Scanner scan = new Scanner (System.in);
   
   for(int i = 0; i < 15; i++)
   {
    System.out.println("Please enter your name");
     names [i] = scan.next();
   }
   //scan and for loop to collect students names
   int index = 0; 
   while (index < 15)
   {
     System.out.println(names[index]+ " sits in seat #" +seatNumbers[index]);
     index++;
   }
   
  }
}