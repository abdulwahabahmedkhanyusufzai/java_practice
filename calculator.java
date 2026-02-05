public class calculator {
    // Encapsulation: Using 'public' access modifier
    public int add(int a, int b) {
        return a + b;
    }

    // Overloading: Same name 'add', but works for 3 numbers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Using Double for Division to avoid integer rounding (e.g., 1/2 = 0.5, not 0)
    public double div(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        calculator calc = new calculator();

        System.out.println("Addition (2 nums): " + calc.add(10, 5));
        System.out.println("Addition (3 nums): " + calc.add(10, 5, 5));
        System.out.println("Division: " + calc.div(5, 2)); // Returns 2.5
    }
}