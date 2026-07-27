
package myconstructorinfo;
import java.util.Scanner;

 class Bankaccount {
	 String Accountholder;
	 long Accountnumber;
	 double balance;
	 Bankaccount(){
		 this("unknown");
	 }
	 Bankaccount(String Accountholder){
		 this(Accountholder,0);
	 }
	 Bankaccount(String Accountholder,long Accountnumber){
		 this(Accountholder,Accountnumber,0.0);
	 }
	 
	 Bankaccount(String Accountholder,long Accountnumber,double balance){
		 this.Accountholder=Accountholder;
		 this.Accountnumber=Accountnumber;
		 this.balance=balance;
	 }
		 void show() {
		 System.out.println("Accountholder:"+Accountholder);
		 System.out.println("Accountnumber:"+Accountnumber);
		 System.out.println("balance:"+balance);
	 }
	public static void main(String[] args) {
		
		Bankaccount b=new Bankaccount();
		b.show();
		Bankaccount b1=new Bankaccount("haritha");
		b1.show();
		Bankaccount b2=new Bankaccount("haritha",123456789);
		b2.show();
		Bankaccount b3=new Bankaccount("haritha",123456789,15000.0);
        b3.show();
	
  
  }
}
