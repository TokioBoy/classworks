package lesson6;


public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 9;
        System.out.println("x = " + x );
        String name = "Vlad";
        String surname ="Guard";
        String fio = name + " " +  surname;
        System.out.println(fio);

        System.out.println(x+y);
        System.out.println(x + " " + y);
        System.out.println(x + y + " " + y + x);

        int x1 = 4;
        int y1 = 5;
        x1 +=4;
        System.out.println(x1);

        System.out.println(y1/x1);
        System.out.println(y1 % x1);
        double z1 = x1;

        int number =725;
        int h = number /100;
        int temp = number % 100;
        int d =temp/10;
        int e= number / 10 ;
        System.out.println("Сотен : " +  h + " ,десятков : " + d + ",едениц : " + e);
    }
}
