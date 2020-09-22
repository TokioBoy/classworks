package Branch.lesson13;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x = 7);
        System.out.println(x == 8);
        // compare - logic operation / > < > c ! ==
        int y = 20;
        boolean c = x < y; // 8 < 20
        System.out.println(c); // true

        int cash = -6;

        if (cash < 0) {
            System.out.println("cash is negative");
        }

        if (cash < 0) {
            System.out.println("cash is negative");
        } else {
            System.out.println("cash is positive");
        }

        if (true)
            if (false)
                System.out.println("a");
            else
                System.out.println("b");


        int price = 10009;
        int money = 1000;
        boolean isOpen = true;
        if (isOpen) {
            if (price <= money) {
                System.out.println("Can buy");
            } else {
                System.out.println("Can't buy");
            }
        } else {
            System.out.println("Shop is closed");
        }
    }
}
