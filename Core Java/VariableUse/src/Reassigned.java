
public class Reassigned {

	public static void main(String[] args) {
		System.out.println("main method start");
		int x = 10;
		System.out.println("x=" + x);
		x = 20;
		System.out.println("x=" + x);
		x=30;
		System.out.println("x="+x);
		//int x=40;//Duplicate local variable x
		System.out.println("main method ends");
		
		//final variable
		final int y=20;
		System.out.println("y="+y);
		//y=40; The final local variable y cannot be assigned
		
		//local variable cannot be used without assing value
		//int z=10,e;
		//E=z+e;//The local variable e may not have been initialized
		//System.out.println("E:"+e);
	}

}
