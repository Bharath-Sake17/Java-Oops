package methodoverloading.com;

public class Payment {
	
//	Method overloading
	
	static void paymentMode() 
	{
		System.out.println("Scan QR code:");
		System.out.println("Rediretcing to paymentGate way");
		System.out.println("------------------------------");
		System.out.println("Your payment successfully done!!!!");
	}
	static void paymentMode(String upi,int amount)
	{
		System.out.println("Re-directing to UPI app");
		System.out.println("-----------------------");
		System.out.println("Payment done through UPI " + " the amount of " + amount);
		System.out.println("Payement done successfully");
	}
	static void paymentMode(String Holdername,long CardNumber,String Expiredate, int CVV, int amount)
	{
		System.out.println("Redirecting to PaymentGateway");
		System.out.println("-----------------------------");
	  System.out.println("Payment done with card No "+CardNumber+" amount of "+ amount);
	  System.out.println("Payement done successfully");
	}

}
