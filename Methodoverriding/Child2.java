package methodoverriding;

public class Child2 extends Child1 {
	
	@Override
	void arthimaticOperations(int num1,int num2)
	{
		int num3= num1+num2;
		int num4= num1-num2;
		int num5= num1*num2;
		int num6= num1/num2;
		int num7= num1%num2;
		System.out.println("Here we observe child2 class Uses same parent method but Here implementation is changed:");
		System.out.println("Addition      : "+num3);
		System.out.println("Substraction  : "+num4);
		System.out.println("Multiplication: "+num5);
		System.out.println("Division      : "+num6);
		System.out.println("Modulo Dvision: "+num7);
	}
		

}
