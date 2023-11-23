import java.util.Scanner;

public class UserInputExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name:");
		String name = sc.nextLine();
		System.out.printf("Hey %s, how are you?\n", name);

		System.out.println("What is your age:");
		int age = sc.nextInt();
		sc.nextLine(); // Consume the newline character

		System.out.println("Is your age: " + age);

		System.out.println("Thanks for the information.");

		System.out.println("How much is your salary:");
		double salary = sc.nextDouble();
		sc.nextLine(); // Consume the newline character

		System.out.println("Is your salary: " + salary);

		System.out.println("What is your phone number:");
		long phoneNumber = sc.nextLong();
		sc.nextLine(); // Consume the newline character

		System.out.println("Is your phone number: " + phoneNumber);

		System.out.println("What is your address:");
		String address = sc.nextLine();

		System.out.println("Is your address: " + address);

		System.out.println("Thanks for giving all the information about U.");
		sc.close();
	}
}
