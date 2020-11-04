package PW9;

import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        int[] z = new int[30];
        for (int i = 0, n = z.length; i < n; i++) {
            z[i] = (int) (Math.random() * 100 * Math.pow(-1, i));}
        for(int i = 0,l= z.length;i<l;i++){System.out.print(z[i]+" , ");}
        Scanner s = new Scanner(System.in);
        System.out.println("\nВведите число:");
        int j = 0;
        int c = s.nextInt();
        for(int i=0,l=z.length;i<l;i++){
            if(z[i]==c){j++;}
        }
        System.out.println(j);

    }
}
