package myconstructorinfo;

public class Car {
	String model;
	String brand;
	double price;
	int year;
	String colour;
public Car(String model) {
		
		this.model = model;
	}



public Car(String model, String brand) {
	super();
	this.model = model;
	this.brand = brand;
}



public Car(String model, String brand, double price) {
	super();
	this.model = model;
	this.brand = brand;
	this.price = price;
}



public Car() {
	model="unknown";
	brand="unknown";
	price=9000;
	year=2003;
	colour="pink";

	
}


	public Car(String model, String brand, double price, int year) {
	super();
	this.model = model;
	this.brand = brand;
	this.price = price;
	this.year = year;
}



	public Car(String model, String brand, double price, int year, String colour) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.year = year;
		this.colour = colour;
	}



	public static void main(String[] args) {
System.out.println("***main method started***");
Car c1=new Car("toyoto","BMW",5000,2025,"RED");
c1.carInfo();
System.out.println("********************************");
Car c2 = new Car("toyoto","BMW",9000,2025,"PURPLE");
c2.carInfo();

	}
	


	void carInfo() {
		System.out.println("model of the car:"+model);
		System.out.println("model of the brand:"+brand);
		System.out.println("model of the price:"+price);
		System.out.println("model of the year:"+year);
		System.out.println("model of the colour:"+colour);
	}

}
