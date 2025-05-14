package methodoverloading.com;

import java.util.Scanner;

public class FLMcourses {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("FLM Offered courses:");
		System.out.println("1. Java Full Stack - JFS");
		System.out.println("2. Python Full Stack - PFS");
		System.out.println("3. DeVops ");
		System.out.println("4. PowerBI");
		System.out.println("Select course code with code number:");
		
		int course =sc.nextInt();
		
		if(course == 1)
		{
			System.out.println();
			FLMcourseDetails.java();
			System.out.println("Purchase course ~");
			FLMpurchase.paymentType();
			System.out.println("Wow ----  You have successfullu enrolled in this course!!!!!!!");
			
		}
		else if(course == 2)
		{
			System.out.println();
			FLMcourseDetails.python();
			System.out.println("Purchase course ~");
			FLMpurchase.paymentType();
			System.out.println("Wow ----  You have successfullu enrolled in this course!!!!!!!");
		}
		else if(course == 3)
		{
			System.out.println();
			FLMcourseDetails.DeVops();
			System.out.println("Purchase course ~");
			FLMpurchase.paymentType();
			System.out.println("Wow ----  You have successfullu enrolled in this course!!!!!!!");
		}
		else if(course == 4)
		{
			System.out.println();
			FLMcourseDetails.PowerBI();
			System.out.println("Purchase course ~");
			FLMpurchase.paymentType();
			System.out.println("Wow ----  You have successfullu enrolled in this course!!!!!!!");
		}
		else
		{
			System.out.println();
			System.out.println("Select valid course!!!!");
		}
		
		
	}
	

}
