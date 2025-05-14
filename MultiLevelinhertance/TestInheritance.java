package multiLevelinhertance;

public class TestInheritance {
	public static void main(String[] args) {
		Fuelcar obj = new Fuelcar();
        System.out.println("Car Name     : "+obj.car);
        System.out.println("Car colour   : "+obj.carColor);
        System.out.println("Ev Car name  : "+obj.Model);
        System.out.println("EvCar colour : "+obj.EVcolor);
        System.out.println("FuelCar color: "+obj.color);
        System.out.println("FuelCar Model: "+obj.model);
		obj.FuelCapacity(50);
		obj.WorkingNature();
		obj.Working();
		obj.PowerCapacity(500);
		obj.working();
	}
	

}
