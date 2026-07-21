package myconstructorinfo;
class Product{
	int productid;
	String productname;
	double productprice;
	Product(int productid,String productname,double productprice){
		this.productid=productid;
		this.productname=productname;
		this.productprice=productprice;
		
	}
	void display() {
		System.out.println("productid:"+productid);
		System.out.println("productname:"+productname);
		System.out.println("productprice:"+productprice);
		System.out.println("-------------------");
	}
}


public class Productdetails {

	public static void main(String[] args) {
		Product p1=new Product(101,"haritha",5000);
		Product p2=new Product(102,"hari",6000);
		Product p3=new Product(103,"hatha",7000);
		p1.display();
		p2.display();
		p3.display();
	}

}
