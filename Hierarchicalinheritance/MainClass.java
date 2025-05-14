package hierarchicalinheritance;

public class MainClass {
	public static void main(String[] args) {
		Dogs d= new Dogs();
		System.out.println("Here Dogs class is Inherit some activities from Animal class");
		d.brak();
		d.eat();
		System.out.println();
		System.out.println("Here Cat class is inherit some activities from parent class Animal ");
		Cat c= new Cat();
		c.meow();
		c.eat();
		System.out.println();
		System.out.println("Here Bird class is inherit some activities from parent class Animal");
		Bird b= new Bird();
		b.sounds();
		b.eat();
		
	}

}
