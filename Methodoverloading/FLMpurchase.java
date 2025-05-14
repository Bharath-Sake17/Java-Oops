package methodoverloading.com;

import java.util.Scanner;

public class FLMpurchase {
	
		
   static void paymentType(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Payment options");
	System.out.println("1. QR code");
	System.out.println("2. UPI");
	System.out.println("3. Crad");
	System.out.println();
	System.out.println("Select payment mode:");
	
	Payment p = new Payment();
	int select = sc.nextInt();
	switch(select)
	{
	case 1:
		System.out.println();
		System.out.println("-->You have select QR code payment mode ");
		p.paymentMode();
		break;
	case 2:
		System.out.println();
		System.out.println("-->You have select UPI payment mode");
		System.out.println("Enter upi_id:");
		String upi= sc.nextLine();
		sc.nextLine();
		System.out.println("Amount of :");
		int amount= sc.nextInt();
		sc.nextLine();
		Payment.paymentMode(upi,amount);
		break;
	case 3:
		System.out.println();
		System.out.println("-->You have select Card payment mode");
		System.out.println("Enter card Holdername:");
		String holdername = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Enter card number :");
		long cardnumber = sc.nextLong();
		
		sc.nextLine();
		System.out.println("Enter Expiredate");
		String exp= sc.nextLine();
		
		System.out.println("Enter Cvv:");
		int cvv= sc.nextInt();
		
		p.paymentMode(holdername, cardnumber, exp, cvv, 5000);
		
		break;
	   default:
		System.out.println("Select valid payment mode!!!!!!");
	     }
}

}
