package array1.part2.lesson25;

public class Main {
    public static void main(String[] args) {
        int[] n = {23, 5, 8, 7, 1};
        // for (int i = 0; i < n.length ; i++) {

        // }//  это правильный вариант кода  но код ниже будет выполняться быстрее и будет меньше грузить систему
        for (int i = 0, a = n.length; i < a; i++) {
            System.out.println(n[i]);
        }{
        int sum = 0;
        for (int i = 0, a = n.length; i < a; i++)
            sum = sum+n[i];
            System.out.println("Сумма чисел : " + sum );
            System.out.println("Среднее арифметическое : " + sum % n.length);
        }
    }
}