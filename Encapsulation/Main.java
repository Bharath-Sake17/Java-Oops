package package1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Encap obj = new Encap();
		System.out.println("Enter Name");
		String name= sc.nextLine();
	
		System.out.println("Enter Age ");
		int age= sc.nextInt();
		obj.setAge(age);
		sc.nextLine();
		System.out.println("Enter city ");
		String v = sc.nextLine();
		System.out.println("Enter Phone number");
		long number= sc.nextLong();
		obj.setName(name);
		obj.setAge(age);
		obj.setCity(v);
		obj.setPhone(number);
		System.out.println();
		System.out.println("Details of the Candidate");
		System.out.println("------------------------");
		System.out.println("Name   : " +name);
		System.out.println("Age    : " +age);
		System.out.println("City   : " +v);
		System.out.println("Number : " +number);
		
	}

}
