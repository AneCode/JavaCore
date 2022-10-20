package Lab;

import java.util.Scanner;

public class SecondLargestValue {

	public static void main(String[] args) {
		//Initiate the class Scanner 
	       int Max = 0;
	       int prevMax=0;
		   Scanner sc=new Scanner(System.in);
		   int a[]=new int[5];
		   
		   
		   System.out.println(" input for array");
		   for(int i=0;i<5;i++){// for loop starting for indexing from 0 to 4
		     a[i]=sc.nextInt();// taking input and assign it to array  
		  
		   }
		   for(int j=0;j<5;j++) {  // for loop starting for indexing from 0 to 4
			   if(Max<a[j]==true){ //checking Max having lesser value than a[j] or not 
				   prevMax=Max;
				  Max=a[j];
			   }
			   
			   
		   }
		 System.out.println("Second Maximum value in Array is:"+prevMax);
		

	}

}
