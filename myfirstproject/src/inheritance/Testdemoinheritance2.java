package inheritance;

class vechicle1 {
    int speed = 50;
void display() {
        System.out.println("vechicle speed:" + speed);
    }
}
class car1 extends vechicle1 {
    int speed = 100;
 @Override
    void display() {
        System.out.println("car speed:" + speed);
    }
}
  public class Testdemoinheritance2 {
      public static void main(String[] args) {
  System.out.println("***main method started***");
    vechicle1 v=new car1();
  System.out.println("speed:" + v.speed);
       v.display();
       System.out.println("***main method ended***");
    }
}
