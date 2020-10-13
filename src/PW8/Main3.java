package PW8;

public class Main3 { public static void main(String[] args) {
    for (int i = 1;i<=10;i++){
        for (int q = 10-i;q>0;q--){
            System.out.print(" ");}
        for (int j = 1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

}
