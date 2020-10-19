package array1.part3.lesson25;

public class Main {
    public static void main(String[] args) {
        int[] n = {23, 5, 8, 7, 1};
        int max = (int) Double.NEGATIVE_INFINITY;
        for (int i = 0, m = n.length; i < m; i++) {
            if (n[i] > max) {
                max = n[i];
                System.out.println("Наибольшее число : " + max);
            }
        }
        int min = (int) Double.POSITIVE_INFINITY;
        for (int i = 0, m = n.length; i < m; i++) {
            if (n[i] < min) ;
            min = n[i];
            int temp = n[i];
            n[1]= n[2];
            n[2]=temp;
        }
        System.out.println("Наименьшее число : " + min);
    }
}
