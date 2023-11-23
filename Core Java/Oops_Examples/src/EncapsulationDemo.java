
class student{
	private int rollNo;
	private String name;
	private boolean isAttend;
	public int getRollNo() {
		System.out.println("student rollNo:"+rollNo);
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		System.out.println("student name:"+name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAttend() {
		System.out.println("student isAttend:"+isAttend);
		return isAttend;
	}
	public void setAttend(boolean isAttend) {
		this.isAttend = isAttend;
	}
	
}
public class EncapsulationDemo {
public static void main(String[] args) {
	student s=new student();
	s.setRollNo(20);
	s.setName("hai");
	s.setAttend(true);
	s.getName();
	s.getRollNo();
	s.isAttend();
	
	
	
}
}
