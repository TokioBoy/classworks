package Branching.lesson14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);// scanner
        System.out.println("Input integer: ");
                int d = s.nextInt();
        System.out.println("Your input is " + d);
      if (d %2 == 0) {
          System.out.println(" Number " + d + " is even");
      }else{
          System.out.println(" Number " + d + " is odd");
      }
        double a, b, c;
        double D;
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Введите a, b и c:");
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        }
        else {
            System.out.println("Уравнение не имеет действительных корней!");
        }
    }
}
