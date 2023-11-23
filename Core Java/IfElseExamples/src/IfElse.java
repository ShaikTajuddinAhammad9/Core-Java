import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter u R Marks:");
		//	int i=sc.nextInt();
		//use to check codition is true or false
		//	if (i%2==0) {
		//		System.out.println("is even:"+i);
		//	}else {
		//		System.out.println("is odd:"+i);
		//	}
		//	int i=sc.nextInt();
		//	if (i<35) {
		//		System.out.println("Student is Faild:"+i);
		//	}else {
		//		System.out.println("Student is Pass:"+i);
		//	}
		//	int i=sc.nextInt();
		//use for equal or not

		//	switch (i%2) {
		//	case 0:
		//		System.out.println("even");
		//		break;
		//	case 1:
		//	case-1:
		//		System.out.println("odd");
		//		break;
		//	case 3:
		//		System.out.println("third");
		//		break;
		//	case 4:
		//		System.out.println("four");
		//		break;
		//	case 5:
		//		System.out.println("five");
		//		break;
		//	case 6:
		//		System.out.println("six");
		//		break;

		//		System.out.println("Enter first number: ");
		//		int num1=sc.nextInt();
		//		System.out.println("Enter second number: ");
		//		int num2=sc.nextInt();
		//		System.out.println("Enter operation (+, -, *, /): ");
		//		char operator = sc.next().charAt(0);
		//
		//		double result;
		//
		//		switch (operator) {
		//		case '+':
		//			result = num1 + num2;
		//			System.out.println(num1 + " + " + num2 + " = " + result);
		//			break;
		//		case '-':
		//			result = num1 - num2;
		//			System.out.println(num1 + " - " + num2 + " = " + result);
		//			break;
		//		case '*':
		//			result = num1 * num2;
		//			System.out.println(num1 + " * " + num2 + " = " + result);
		//			break;
		//		case '/':
		//			if (num2 != 0) {
		//				result = num1 / num2;
		//				System.out.println(num1 + " / " + num2 + " = " + result);
		//			} else {
		//				System.out.println("Error: Division by zero is not allowed.");
		//			}
		//			break;
		//		default :
		//			System.err.println("invalid");
		//			break;
		//		}



		System.out.println("Enter a day number (1-7): ");
		int day = sc.nextInt();

		String message;

		switch (day) {
		case 1:
			message = "Sunday";
			break;
		case 2:
			message = "Monday";
			break;
		case 3:
			message = "Tuesday";
			break;
		case 4:
			message = "Wednesday";
			break;
		case 5:
			message = "Thursday";
			break;
		case 6:
			message = "Friday";
			break;
		case 7:
			message = "Saturday";
			break;
		default:
			message = "Invalid day number. Please enter a number between 1 and 7.";
		}

		if (day == 6 || day == 7) {
			message += " (Weekend)";
		}

		System.out.println("You entered: " + message);
	}



}
