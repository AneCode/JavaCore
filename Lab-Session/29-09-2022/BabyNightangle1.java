/* @author:Aneeque Khan
Program Name:create a class parent with default constructor and void sing method.print something inside the constructor and method
Create child class which will inherit the property of parent and has methods void speak and void dance.print something inside the two methods.
Create another class inheritance and object of class and call all the methods.also mention the type of inheritance on the top of the program.
Date:29-09-2022
*/
package corejava;
// BabyNightangle1 class inherit property of Nightingale class. 
public class BabyNightangle1 extends Nightingale{
//defining default Constructor
	public BabyNightangle1() {
		System.out.println("Default constructor of BabyNightangle1 ");
	}
	// defining speak method
	void speak() {
		System.out.println("speake method of BabyNightangle1 cute sound by BabyNightangle1 ");
	}
	//defining dance method 
	void dance() {
		System.out.println("lovely dance by BabyNightangle1 ");
	}

}
