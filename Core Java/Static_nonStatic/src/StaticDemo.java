import java.util.Random;

public class StaticDemo {
	static int num;
	public static void test() {
		System.out.println("static method");
	}
	public  void test1() {
		System.out.println("non static method");
	}
	static {
		System.out.println("static block");
	}
	{
		System.out.println("non static block");
	}
	public StaticDemo() {
		System.out.println("constructor block");
	}
public static void main(String[] args) {
	System.out.println("main method starts");
	
	StaticDemo sd=new StaticDemo();
	sd.num=new Random().nextInt();
	
	StaticDemo sd1=new StaticDemo();
	sd1.num=new Random().nextInt();
	
	StaticDemo sd2=new StaticDemo();
	sd2.num=new Random().nextInt();
	
	System.out.println(sd.num);
	System.out.println(sd1.num);
	System.out.println(sd2.num);
	System.out.println(StaticDemo.num);
	StaticDemo.test();
	sd.test1();
	System.out.println(sd.equals(sd1)) ;
}
}
