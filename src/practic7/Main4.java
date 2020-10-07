package practic7;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("Введите число : ");
        Scanner s=new Scanner(System.in);
        int k = s.nextInt();
        int z = s.nextInt();
        int i = 0;
        while (i < 1000) {
            i++;
            {
                if (i%k==0|i%z==0){ ;
                    System.out.println(i);
                }
            }
        }}}

