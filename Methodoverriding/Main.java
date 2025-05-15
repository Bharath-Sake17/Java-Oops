package methodoverriding;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Parent obj= new Parent();
		Child1 obj1= new Child1();
		Child2 obj2 = new Child2();
		System.out.println("Enter First number:");
		int number1= sc.nextInt();
		System.out.println("Enter Secodn number:");
		int number2= sc.nextInt();
		obj.arthimaticOperations(number1, number2);
		obj1.arthimaticOperations(number1, number2);
		obj2.arthimaticOperations(number1, number2);
		sc.close();
	}

}
