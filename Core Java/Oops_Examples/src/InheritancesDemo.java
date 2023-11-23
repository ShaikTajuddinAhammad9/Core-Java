
public class InheritancesDemo extends Admin {
public static void main(String[] args) {
	Admin a=new Admin();
	a.read();
	a.manage();
	a.write();
	Developer d=new Developer();
	d.read();
	d.write();
	Guest g=new Guest();
	g.read();
}
}
class Admin extends Developer{  
	public void manage() {
		super.read();
		write();
		System.out.println("manage the code");
	}
	public void read() {
		System.out.println("admin read the code");
	}

}
class Guest{   //parent
	public void read() {
		System.out.println("read the code");
	}
}
class Developer extends Guest{  //child
	
	public void write() {
		System.out.println("write the code");
	}
}