package myconstructorinfo;

public class Vechicle {
	String model;
	String brand;
	double price;

	void VechicleInfo() {
		System.out.println("model:"+model);
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
	}
	class bike extends Vechicle{

	public static void main(String[] args) {
		System.out.println("main method started");
		Vechicle v=new Vechicle();
		bike b=v.new bike();
		b.VechicleInfo();
			
		}

	}

}










