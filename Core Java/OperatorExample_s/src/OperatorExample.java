public class OperatorExample {

    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        // Relational Operators
        boolean isEqual = (a == b);
        boolean notEqual = (a != b);
        boolean isGreaterThan = (a > b);
        boolean isLessThan = (a < b);
        boolean isGreaterOrEqual = (a >= b);
        boolean isLessOrEqual = (a <= b);

        // Logical Operators
        boolean condition1 = true;
        boolean condition2 = false;
        boolean logicalAnd = (condition1 && condition2);
        boolean logicalOr = (condition1 || condition2);
        boolean logicalNot = !condition1;

        // Bitwise Operators
        int x = 5;
        int y = 3;
        int bitwiseAnd = x & y;
        int bitwiseOr = x | y;
        int bitwiseXor = x ^ y;
        int bitwiseNot = ~x;

        // Assignment Operators
        int c = 7;
        c += 3; // equivalent to c = c + 3;
        c -= 2; // equivalent to c = c - 2;
        c *= 4; // equivalent to c = c * 4;
        c /= 2; // equivalent to c = c / 2;
        c %= 3; // equivalent to c = c % 3;

        // Increment and Decrement Operators
        int d = 10;
        int preIncrement = ++d;
        int postIncrement = d++;
        int preDecrement = --d;
        int postDecrement = d--;

        // Conditional (Ternary) Operator
        int age = 20;
        String status = (age >= 18) ? "Adult" : "Minor";

        // Instanceof Operator
        Object obj = new String("Hello");
        boolean isString = (obj instanceof String);

        // Type Cast Operator
        double pi = 3.14159;
        int approxPi = (int) pi;

        // Member Access Operators
        String message = "Hello World";
        int messageLength = message.length();

        // Print the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        System.out.println("isEqual: " + isEqual);
        System.out.println("notEqual: " + notEqual);
        System.out.println("isGreaterThan: " + isGreaterThan);
        System.out.println("isLessThan: " + isLessThan);
        System.out.println("isGreaterOrEqual: " + isGreaterOrEqual);
        System.out.println("isLessOrEqual: " + isLessOrEqual);

        System.out.println("logicalAnd: " + logicalAnd);
        System.out.println("logicalOr: " + logicalOr);
        System.out.println("logicalNot: " + logicalNot);

        System.out.println("bitwiseAnd: " + bitwiseAnd);
        System.out.println("bitwiseOr: " + bitwiseOr);
        System.out.println("bitwiseXor: " + bitwiseXor);
        System.out.println("bitwiseNot: " + bitwiseNot);

        System.out.println("c: " + c);

        System.out.println("preIncrement: " + preIncrement);
        System.out.println("postIncrement: " + postIncrement);
        System.out.println("preDecrement: " + preDecrement);
        System.out.println("postDecrement: " + postDecrement);

        System.out.println("status: " + status);
        System.out.println("isString: " + isString);

        System.out.println("approxPi: " + approxPi);
        System.out.println("messageLength: " + messageLength);
    }
}
