package practic7;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("Введите число : ");
        Scanner s = new Scanner(System.in);
int k = s.nextInt();
        System.out.println("Введите второе число: ");
Scanner y = new Scanner(System.in);
int q =y.nextInt();
int i =0;
int r =0;
while (i<1000) {
    if (i % k == 0 || i % q == 0) {
        r++;
    }
    i++;
}
        System.out.println(r);
    }}