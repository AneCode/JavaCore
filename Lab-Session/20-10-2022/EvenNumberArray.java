package Lab;
import java.util.Scanner;

public class EvenNumberArray {

	public static void main(String[] args) {
		//Initiate the class Scanner 
	   Scanner sc=new Scanner(System.in);
	   int a[]=new int[5];
	   
	   System.out.println("Even input for array");
	   for(int i=0;i<5;i++){// for loop starting for indexing from 0 to 4
	     a[i]=sc.nextInt();// taking input and assign it to array  
	  
	   }
	   System.out.println("Even Values:");
	   for(int j=0;j<5;j++) { // for loop starting for indexing from 0 to 4
		   if(a[j]%2==0){//checking values  of array, even or  not 
			   System.out.print("["+a[j]+"]  "); // print the even values
		   }
	   }
	    
	  
	}

}
