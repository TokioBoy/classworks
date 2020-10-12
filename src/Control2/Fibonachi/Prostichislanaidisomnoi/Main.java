package Control2.Fibonachi.Prostichislanaidisomnoi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
    }
   System.out.println("Введите положительное число: ");
                Scanner in = new Scanner(System.in);
                int x = in.nextInt();
                boolean z = true;
                for (int P = 2;  P <= x; P++) {
                    for (int i = 2; i < P; i++) {
                        if (P % i == 0) {
                            z = false;
                            break;
            }
        }
        if (z) System.out.println(P);
        else z = true;
    }
} }

