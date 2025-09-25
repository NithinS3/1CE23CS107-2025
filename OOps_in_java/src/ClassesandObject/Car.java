package ClassesandObject;
 class Car {
	 String brand;
	 String model;
	 public void display() {
		 System.out.println("Brand:"+brand);
		 System.out.println("Model:"+model);
	 }
public class Classobject{
	public static void main(String[] args) {
		Car a=new Car();
		a.brand="BMW";
		a.model="Tesla";
		Car b=new Car();
		b.brand="Maruthi";
		b.model="sandy";
		a.display();
		b.display();
		
		}
		

	}

}
