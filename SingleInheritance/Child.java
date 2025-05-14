package singleInheritance;

public class Child extends Parent {
	public static void main(String[] args) {
		
		Child ch = new Child();
		System.out.println("Child get all properties from parent");
		// This wiil be represents Single Inheritance
		System.out.println("------------------------------------");
		ch.properties();
	}
	
}
