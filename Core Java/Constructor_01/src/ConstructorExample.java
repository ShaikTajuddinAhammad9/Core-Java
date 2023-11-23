
public class ConstructorExample {
	int i;
	public ConstructorExample(){
		i=40;
	}
	public ConstructorExample(int a){
		i=a;
	}
public static void main(String[] args) {
	ConstructorExample ce=new ConstructorExample(30);
	System.out.println(ce.i);
}
}
