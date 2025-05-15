package methodoverriding;

public class Parent{
	
    void arthimaticOperations(int num1, int num2)
	{
		int num3= num1+num2;
		int num4= num1-num2;
		System.out.println("Here we observe Parent class method implementation");
		System.out.println("Sum in parent class         : "+num3);
		System.out.println("Substraction in parent class: "+num4);
		System.out.println();
	}
	

}
