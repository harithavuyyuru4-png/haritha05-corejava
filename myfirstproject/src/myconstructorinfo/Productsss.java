package myconstructorinfo;

 class Productsss {
	 String model;
	 String brand;
	 double price;

 public Productsss() {
	 System.out.println("***no arg constructor calledd***");
  
 }
 public Productsss(String model,String brand,double price){
	 this.model=model;
	 this.brand=brand;
	 this.price=price;
	 
 }
 void productInfo() {
	 System.out.println("model:"+model);
	 System.out.println("brand:"+brand);
	 System.out.println("price:"+price);
	 
 }
 
 static class Mobile extends Productsss{
	 public Mobile(String model,String brand,double price) {
		 super(model,brand,price);
		 System.out.println("parameterized constructor called from mobile");
	 }
 }
 
	 

	public static void main(String[] args) {
		System.out.println("main method started");
		Productsss p=new Productsss();
		p.productInfo();
		Productsss p1=new Productsss("9R","ONEPLUS",40000.0);
		p1.productInfo();
		  Mobile m = new Mobile("7R", "Samsung", 85000);
	        m.productInfo();
	}

}
