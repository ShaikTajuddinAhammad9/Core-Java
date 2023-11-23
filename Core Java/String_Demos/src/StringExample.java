import java.util.Arrays;

public class StringExample {
public StringExample(String string) {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
	String s="hello";
	String s2=" heLlo world";
	System.out.println(s==s2);
	System.out.println(s.equals(s2));
	String s1=new String("hello");
	String s3=new String("hello");
	StringExample se=new StringExample("hello");
	System.out.println(s1.equals(s3));
	System.out.println(s1==s3);
	System.out.println(s.equals(s1));
	System.out.println(s==s1);
	System.out.println(s2.equals(s3));
	System.out.println(s2==s3);
	System.out.println("--------------------");
	System.out.println(s);
	System.out.println(s1);
	System.out.println(s+s1);  //concat
	System.out.println(new StringExample(s));
	System.out.println("--------------------");
	System.out.println(s.equalsIgnoreCase(s2));
	System.out.println(s.contains("el"));
	System.out.println(s.startsWith("h"));
	System.out.println(s.endsWith("lo"));
	System.out.println(s2.length());
	System.out.println(s2.trim().length());
	System.out.println(s.toLowerCase());
	System.out.println(s.toUpperCase());
	System.out.println(s.toCharArray());
	System.out.println(s.charAt(3));
	System.out.println(s.indexOf("l"));
	System.out.println(s.substring(2,4));
	System.out.println(Arrays.toString(s.split("")));
	System.out.println(s.charAt(2));
	System.out.println(s.replace("o", "l"));
	System.out.println(s.valueOf(s2));
	System.out.println(s.isEmpty());
	System.out.println(s.isBlank());
}
}
