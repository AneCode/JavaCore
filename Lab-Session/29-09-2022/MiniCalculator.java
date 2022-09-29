package corejava;
import java.util.Scanner; 
public class MiniCalculator {

	public MiniCalculator() {
		System.out.println("Default Constrctor");
	}

	public static void main(String[] args) {
		//creating instance of Scanner class
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter first Number: ");
		   //taking  1st input from user
		   int x=sc.nextInt();
		   System.out.println("Enter second Number: ");
		 //taking  2nd input from user
		   int y=sc.nextInt();
		   System.out.println("Enter  press1 => print addition of first and second\r\n"
		   		+ " press2 => print subtraction of first and second\r\n"
		   		+ "press3 => print multiplication of first and second\r\n"
		   		+ "press4 => print division of first and second  ");
		 //taking  3nd input from user
		   int z=sc.nextInt();
		   switch(z) //Using Switch Statement
		   {
		        case 1:System.out.println("Sum is :"+(x+y));
			    break;
			    case 2:System.out.println("Substraction is :"+(x-y));
			    break;
			    case 3:System.out.println("Multiplication is :"+(x*y));
			    break;
			    case 4:
			    if(y!=0) 
			     {
			      System.out.println("division is :"+(x/y));
			     } 
			    break;
			    default:
			    	System.out.println("Wrong Press");
			    	
		   }
		

	}

}
