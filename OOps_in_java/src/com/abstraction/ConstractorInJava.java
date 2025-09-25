package com.abstraction;


class grandparent{
	public grandparent() {
		super();
		System.out.println("Grandparent Constractor");
	}
}
class person extends grandparent{
	int parent_id = 20;
	public person() {
	super();
	System.out.println("Person Constractor");

}
	
}



class student extends person{
	public int id;
	public String name;
	public student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public student(int id) {
		super();
		this.id = id;
		System.out.println(+super.parent_id);
	}
	
}

public class ConstractorInJava {
	public static void main(String[] args) {
		student s1=new student(101,"Nidhi");
		student s2=new student(102);
System.out.println("First Student:");
System.out.println("Id:"+s1.id);
System.out.println("name:"+s1.name);
System.out.println("Second Student:");
System.out.println("Id:"+s2.id);
System.out.println("name:"+s2.name);				
				
	}

}
