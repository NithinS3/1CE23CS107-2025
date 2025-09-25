package Functions;

public class func {
	public int add(int a,int b) {
	return a+b;
}
	public int sqr(int a) {
		return a*a;
	}

public static void main(String[] args) {
	func s=new func();
	int res=s.add(10,30);
	int reses=s.add(100, 300);
	int z=s.sqr(20);
	System.out.println(+z);
	System.out.println(+res);
	System.out.println(+reses);

}
}
