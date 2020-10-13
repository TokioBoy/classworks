package PW8;

public class Main5
{ public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int h = 10 - i; h > 0; h--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");}
            for (int j2 = 1; j2 < i; j2++) {
                System.out.print("*");
            }
            for (int s2 = 10 - i; s2 > 0; s2--) {
                System.out.print(" ");

            }

            System.out.println();
        }
        for (int i = 1; i <= 10; i++) {
            for (int s = 10 - i; s > 0; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");}
            for (int k2 = 1; k2 < i; k2++) {
                System.out.print("*");
            }
            for (int p2 = 10 - i; p2 > 0; p2--) {
                System.out.print(" ");

            }

            System.out.println();
        }

    }
    }


