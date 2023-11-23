
public class ObjectDemo {
	int i=10;
	int j=20;
	public int add() {
		return i+j;
	}
	public ObjectDemo() {
		i=20;
		j=30;
	}
	public ObjectDemo(int i,int j) {
		this.i=i;
		this.j=j;
	}
	public static void main(String[] args) {
		ObjectDemo od=new ObjectDemo();
		ObjectDemo od1=new ObjectDemo(15,25);
		ObjectDemo od2=new ObjectDemo(35,20);
		System.out.println(od.hashCode());
		System.out.println(od1.hashCode());
		System.out.println(od.add());
		System.out.println(od1.add());
		System.out.println(od2.add());
		System.out.println(od==od1);
		System.out.println(od1==od2);
		System.out.println(od.i);
		System.out.println(od.j);
	}
}
