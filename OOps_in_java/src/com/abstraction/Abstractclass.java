package com.abstraction;
abstract class shape{
	abstract void draw();
public void display() {
	System.out.println("This is display function");
}


}
class circle extends shape{
void draw() {
	System.out.println("This is shape draw method ");
}
}


public class Abstractclass {
	public static void main(String[] args) {
		circle circle =new circle();
		circle.draw();
		circle.display();
	}
}