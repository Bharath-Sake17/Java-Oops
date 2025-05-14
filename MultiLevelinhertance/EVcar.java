package multiLevelinhertance;

public class EVcar extends Car{
	String Model= "Tata";
	String EVcolor="White";

	int capacity;
	void PowerCapacity(int cap) {
		this.capacity= cap;
		System.out.println("Power capacity: "+cap);
	}
	void Working() {
		System.out.println("It is workign on Electric power");
	}
	

}
