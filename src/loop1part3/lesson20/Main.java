package loop1part3.lesson20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pass = 0;
        do {
            System.out.println("Input password : " );
            pass = s.nextInt();

        }while(pass != 126);
        System.out.println("Congratulations");
    }
}
