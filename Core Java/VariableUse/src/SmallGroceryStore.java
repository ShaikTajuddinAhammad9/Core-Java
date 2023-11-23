public class SmallGroceryStore {
    int x = 10;
    int y = 20;
    static int e = 30;
    static int r = 40;

    public static void main(String[] args) {
        int a = 50;
        int b = 60;

        SmallGroceryStore store = new SmallGroceryStore();

        // Approach 1: Accessing variables directly
        System.out.println("Approach 1:");
        System.out.println("x: " + store.x);
        System.out.println("y: " + store.y);
        System.out.println("e: " + e);
        System.out.println("r: " + r);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println(SmallGroceryStore.e);
        System.out.println(SmallGroceryStore.r);

        // Approach 2: Accessing variables using methods
        System.out.println("\nApproach 2:");
        store.printVariables(a, b); // Pass 'a' and 'b' as parameters

        // Approach 3: Accessing variables using an array
        System.out.println("\nApproach 3:");
        int[] variables = {store.x, store.y, e, r, a, b};
        for (int variable : variables) {
            System.out.println(variable);
        }

        // Approach 4: Accessing variables using a loop
        System.out.println("\nApproach 4:");
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    System.out.println("x: " + store.x);
                    break;
                case 1:
                    System.out.println("y: " + store.y);
                    break;
                case 2:
                    System.out.println("e: " + e);
                    break;
                case 3:
                    System.out.println("r: " + r);
                    break;
                case 4:
                    System.out.println("a: " + a);
                    break;
                case 5:
                    System.out.println("b: " + b);
                    break;
            }
        }
    }

    public void printVariables(int a, int b) { // Add 'a' and 'b' as parameters
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("e: " + e);
        System.out.println("r: " + r);
        System.out.println("a: " + a); // Access parameter 'a'
        System.out.println("b: " + b); // Access parameter 'b'
    }
}
