package methodoverriding;

public class Child1 extends Parent {
	
	@Override
     void arthimaticOperations(int num1,int num2)
	{
		int num3 = num1*num2 + num1 +num2;
		int num4= num1-num2;
		// Here we observe same method used which is present in parent class
		// but here we change the implementation
		System.out.println("Here we observe child1 class Uses same parent method but Here implementation is changed:");
		System.out.println("Child1 with additon and multipication: "+num3);
		System.out.println("Substraction in the child1 class     : "+num4);
		System.out.println();
	}

}
