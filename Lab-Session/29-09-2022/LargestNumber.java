/* @author:Aneeque Khan
Program Name:Find largest number between two numbers.
Date:29-09-2022
*/
package corejava;
import java.util.Scanner; 

public class LargestNumber {
  
	public static void main(String[] args) {
		//creating instance of Scanner class
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter first Number: ");
		   //taking  1st input from user
		   int x=sc.nextInt();
		   System.out.println("Enter second Number: ");
		 //taking  2nd input from user
		   int y=sc.nextInt();
		   if(x>y) { //using relation operator 
			   System.out.println(x+" is greater than " +y);
		   }
		   else if(x==y){
			   System.out.println("No Number is greater. both are equal");
		   }
		   else {
			   System.out.println(y+" is greater than " +x);
		   } 
		   
		

	}

}
