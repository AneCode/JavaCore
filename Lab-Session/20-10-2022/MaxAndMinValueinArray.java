package Lab;

import java.util.Scanner;

public class MaxAndMinValueinArray {

	public static void main(String[] args) {
		//Initiate the class Scanner 
	       int Max = 0;
	       int Min=100000;
		   Scanner sc=new Scanner(System.in);
		   int a[]=new int[5];
		   
		   
		   System.out.println(" input for array");
		   for(int i=0;i<5;i++){// for loop starting for indexing from 0 to 4
		     a[i]=sc.nextInt();// taking input and assign it to array  
		  
		   }
		   for(int j=0;j<5;j++) {  // for loop starting for indexing from 0 to 4
			   if(Max<a[j]==true){ //checking Max having lesser value than a[j] or not 
				  Max=a[j];
			   }
			   if(Min>a[j]==true)//checking Min having greater value than a[j] or not 
			   {
				   Min=a[j];
			   } 
			   
			   
		   }
		 System.out.println("Maximum value in Array is:"+Max);
		  System.out.println("Minimum value in Array is:"+Min);
	}

}
