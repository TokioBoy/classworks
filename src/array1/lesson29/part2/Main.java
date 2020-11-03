package array1.lesson29.part2;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 334, 64, 21, 6, 27};
        for (int i = 0, n = numbers.length; i < n; i++) {
            numbers[i] = (int) (Math.random() * 100);

        }
        for (int temp : numbers) {
            System.out.println(" " + temp);
        }
        int count = 0, sum = 0;
        for (int i = 0, n = numbers.length; i < n; i++) {
            if (i % 2 == 0&numbers[i]>20&numbers[i]<30) {
                count++;
                sum = sum + numbers[i];
            }
        }
        System.out.println("Количество: " + count + " \nСумма: " + sum);
    }
}