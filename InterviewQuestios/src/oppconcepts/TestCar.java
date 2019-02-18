package oppconcepts;

public class TestCar {

	//Method over riding: when same methods with same name and 
	//same arguments presents in parents calss and child class is called method over riding
	
	//Static polymorphism -- compile time polymorphism
	
	// is called method overriding in the compile time it will decide which method it has to take
	
	public static void main(String[] args) {
		Bmw b = new Bmw();
		b.start();
		b.stop();
		b.refuel();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		Car c1 = new Bmw();
		c1.start();
		c1.stop();
	//	c1.threftSafety we cannot call 
		
		//child class object can be refferered by parent class reference variable 
     // dynamic polymorhism or runtime polymorhysm
		
		
	}

}
