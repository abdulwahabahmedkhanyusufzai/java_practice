public class conditions {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if (a > b || a < b) {
            System.out.println("a is greater than b");
        } else if (a < b && a > b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is equal to b");
        }

        switch (a) {
            case 1:
                System.out.println("a is 1");
                break;
            case 2:
                System.out.println("a is 2");
                break;
            default:
                System.out.println("a is not 1 or 2");
        }

        String result = (a > b) ? "a is greater than b" : "a is less than b";
        System.out.println(result);
    }
}
