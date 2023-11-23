import java.util.Scanner;

public class ForDemo {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int i=sc.nextInt();
//		int j=150;
	int sum=0;		
//		for (i=50; i <= j; i++) {
//			if (i%2==0) {
//				
//				System.out.println(i);	
//				
//			}
//			sum+=i;
//			System.out.println("sum:"+sum);
//		}
		int arr[][]= {{1,23,3},
				{4,5,6,7,7},
				{8,8,9,0}
				};
			
		for (int[] i : arr) {
		for (int j : i) {
			sum+=j;
		}
			
		}
		System.out.println(sum);
	}

}
