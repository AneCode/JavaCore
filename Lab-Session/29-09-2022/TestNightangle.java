/* @author:Aneeque Khan
Program Name:create a class parent with default constructor and void sing method.print something inside the constructor and method
Create child class which will inherit the property of parent and has methods void speak and void dance.print something inside the two methods.
Create another class inheritance and object of class and call all the methods.also mention the type of inheritance on the top of the program.
Date:29-09-2022
*/
package corejava;
//Main class for execuation of main method  and creating instance of class of BabyNightangle1 and invoking all  its methods.
public class TestNightangle {

	public static void main(String[] args) {
		//creating instance of BabyNightangle1 class
		BabyNightangle1 bn=new BabyNightangle1();
		//invoking all function   including parent class methodes  . 
		bn.sing();
		bn.speak();
		bn.dance();

	}

}
