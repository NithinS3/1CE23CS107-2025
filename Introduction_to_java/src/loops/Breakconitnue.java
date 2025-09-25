package loops;

public class Breakconitnue {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue;
			}
			else if(i==0) {
				break;
			}
			else {
				System.out.println(+i);
			}
		}
	}

}
