
public class Operators {
	public static void main(String[] args) {
		int i=10;
		int j=20;
		int k=j++ + ++j +j-- - --j;//20+22 + 22-20=42+2=44
		System.out.println(k);
//		i%=5;
//		System.out.println(i);
		
//		System.out.println(i+j);
//		System.out.println(i-j);
//		System.out.println(i*j);
//		System.out.println(i/j);
//		System.out.println(i%j);
		
//		System.out.println(i);
//		System.out.println(++i);
//		System.out.println(i++);
//		System.out.println(i);
		
//		System.out.println(i);
//		System.out.println(--i);
//		System.out.println(i--);
//		System.out.println(i);
		
//		System.out.println(i==j);//10==20 false
//		System.out.println(i!=j);//10!=20 true
//		System.out.println(i>j);//10>20 false
//		System.out.println(i<j);//10<20 true
//		System.out.println(i>=j);//10>=20 false
//		System.out.println(i<=j);//10<=20 true
		
	//	System.out.println(i>j && i<j); //false and true=false
		
		/*
		 * && true-true=true
		 *    false and true=false
		 *    false and false=false
		 *    true-false=false
		 */
	//	System.out.println(i>j || i<j); //false and true=true
		
		/*
		 * || true-true=true
		 *    false - true=true
		 *    false- false=false
		 *    true-false=true
		 */
	}
}
