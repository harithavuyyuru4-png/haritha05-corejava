package inheritance;

class Orderdetails {

    int orderid;
    String customername;
    double price;

    Orderdetails(int orderid, String customername, double price) {
        this.orderid = orderid;
        this.customername = customername;
        this.price = price;
    }

    void displayDetails() {
    	System.out.println("********");
        System.out.println("Order ID: " + orderid);
        System.out.println("Customer Name: " + customername);
        System.out.println("Price: " + price);
       
    }
}

class Pizzaorder extends Orderdetails {

    Pizzaorder(int orderid, String customername, double price) {
        super(orderid, customername, price);
    }

    void Preparefood() {
        System.out.println("Pizza is being prepared");
    }
}

class Burgerorder extends Orderdetails {

    Burgerorder(int orderid, String customername, double price) {
        super(orderid, customername, price);
    }

    void Cookingfood() {
        System.out.println("Burger is being prepared");
    }
}

public class OrderMain {

    public static void main(String[] args) {

        Pizzaorder p = new Pizzaorder(101, "Haritha", 250);
        p.displayDetails();
        p.Preparefood();


        Burgerorder b = new Burgerorder(102, "Mavya", 560);
        b.displayDetails();
        b.Cookingfood();
        
       
    }
}