package Corejava;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseJava {
	void reverse(String Fest)
	{
		String s="";
	  	for(int i=Fest.length()-1;i>=0;i--){
//	  		System.out.println(i);
	  		s=s+Fest.charAt(i);
	  	}
	  	System.out.println("Reverse of String+ "+s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String Fest=sc.nextLine();
		ReverseJava rj=new ReverseJava();
		rj.reverse(Fest);
	
	}

}
