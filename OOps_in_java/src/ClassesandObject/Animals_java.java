package ClassesandObject;
class animal{
	public void eat()
	{
		System.out.println("Animal is eating");
	}
	public void iswalking() {
		System.out.println("Animals is Walking");
	}
}
class dog extends animal {
	public void eat()
	{
		System.out.println("Dog is eating");
	}
	public void iswalking() {
		System.out.println("Dog is walking");
	}
	public class inheritence{
		public static void main(String [] args) {
			dog d1=new dog();
			d1.eat();
			d1.iswalking();
		}
}

}
