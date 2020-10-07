package Control2.Fibonachi;

import java.util.Scanner;

public class Main {public static void main(String[] args){
    int x0 = 1;
    int x1 = 1;
    int x2;
    System.out.println("Введите число : ");
    Scanner s=new Scanner(System.in);
    int z = s.nextInt();
    System.out.print(x0+" "+x1+" ");
    for(int i = 3; i <= z; i++){
        x2=x0+x1;
        System.out.print(x2+" ");
        x0=x1;
        x1=x2;
    }
    System.out.println();
}
}
