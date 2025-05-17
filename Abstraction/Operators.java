package abstraction.com;

import java.util.Scanner;

public class Operators extends ArthemeticOperations {

	Scanner sc = new Scanner(System.in);
	
	@Override
	public void sum() {
		System.out.println("For sum operation");
		System.out.println("---------------------------");
		System.out.println("Enter first number:");
		int a= sc.nextInt();
	    int num1=a;
		System.out.println("Enter Second number:");
		int b=sc.nextInt();
		int num2=b;
		int sum= num1 +num2;
		System.out.println("Sum     : "+sum);
		System.out.println();
		
	}

	@Override
	public int multipication() {
		System.out.println("For Multipication operation");
		System.out.println("---------------------------------------");
		System.out.println("Enter first number:");
		int a= sc.nextInt();
	    int num1=a;
		System.out.println("Enter Second number:");
		int b=sc.nextInt();
		int num2=b;
		int num3= num1*num2;
		System.out.println("Multipication: "+num3);
		
		System.out.println();
		return num3;
	}

	@Override
	public int Substraction() {
		System.out.println("For Substraction operation");
		System.out.println("------------------------------------");
		System.out.println("Enter first number:");
		int a= sc.nextInt();
	    int num1=a;
		System.out.println("Enter Second number:");
		int b=sc.nextInt();
		int num2=b;
		int num3 = num1-num2;
		System.out.println("Substraction: "+num3);
		System.out.println();
		return num3;
	}

}
