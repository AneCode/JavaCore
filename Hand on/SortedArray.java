package Corejava;
import java.util.*;
public class SortedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	 int a[]=new int[5]; 
     for(int i=0;i<5;i++) {
    	 a[i]=sc.nextInt();
     }
     System.out.println("Input Array:");
     Arrays.sort(a);
     for(int i:a){
    	 System.out.print(i+",");
     }
   	
    System.out.println("\nSortd Arrays:");
  for(int i:a) {
	System.out.print(i+","); 
  }
	} 
}
