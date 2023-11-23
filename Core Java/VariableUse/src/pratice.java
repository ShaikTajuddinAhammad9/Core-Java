
public class pratice {
	//non static
	int a=10;
	public void reassign() {
		a=20;
	}
	static int b=20;
	public static void reassign1() {
		b=30;
	}
	
	
public static void main(String[] args) {
	int c=40;
	c=30;
	pratice p=new pratice();
	p.reassign();
	System.out.println(p.a);
	reassign1();
	System.out.println(b);
	System.out.println(c);
}
}
