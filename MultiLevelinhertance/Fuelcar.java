package multiLevelinhertance;

public class Fuelcar extends EVcar {
	String color="Black";
	String model="Innova";
	int disealCapacity;
	
	void FuelCapacity(int capacity)
	
	{
		this.disealCapacity= capacity;
		System.out.println("Fuel car get all fature form  parent classes");
		System.out.println("Fuel capacity : "+capacity);
	}
	void WorkingNature()
	{
		System.out.println("It is working on fuel");
	}
	Fuelcar()
	{
		super();
	}
	

}
