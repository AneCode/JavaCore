/* @author:Aneeque Khan
Program Name:WAP to take na even number as an input from the user using array and print those numbers. 
Date:20-10-2022
*/
package Lab;

import java.util.Scanner;

public class AverageValueofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initiate the class Scanner 
		int sum=0;
		float avg=0.0f;
		   Scanner sc=new Scanner(System.in);
		   int a[]=new int[5];
		   
		   System.out.println(" input for array");
		   for(int i=0;i<5;i++){// for loop starting for indexing from 0 to 4
		     a[i]=sc.nextInt();// taking input and assign it to array  
		  
		   }
		   //getting Sum of Array 
		   for(int j=0;j<5;j++) { // for loop starting for indexing from 0 to 4
			   sum=sum+a[j];
		   }
		   //Calculating average of array 
		   avg=sum*1.0f/5;
		   System.out.println("Average of array:"+avg);

	}

}
