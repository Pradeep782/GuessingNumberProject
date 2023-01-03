package mypack;
import java.util.Scanner;


public class Booleancheck {

  public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
	       int num = 0;
           System.out.println("Enter the value: \n");
           
           Scanner sc = new Scanner(System.in);
           num = sc.nextInt();
           
           System.out.println("is number " +num+ " binary?" );
           System.out.println(checkBinary(num));
           
         }
	static boolean checkBinary(int n) {
	 	   while(n != 0) {
	 		   if(n%10 >1) {
	 			   return false;
	 		   }
	 		   n = n/10;
	 	   }
	 	   return true;
       
         
       }
}


