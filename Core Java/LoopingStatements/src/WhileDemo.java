
public class WhileDemo {
public static void main(String[] args) {
	  int i=150;
	  int j = 200;
//	while (i<=j) {
//		if (i%7==0) {
//			System.out.println(i);
//		}
//		
//		i++;
//	}
//	System.out.println("---------------------");
	do {
		if (i%7==0) {
			System.out.println(i);
		}
		
		i++;
	} while (i<=j);
//	  do {
//		  if(i > j) {
//			  break; 
//		  }
//		  j--;   
//	
//	} while (++i < 5);
	  //System.out.println(i);
	  //System.out.println(j);
}
}
