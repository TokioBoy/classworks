package array1.lesson29.part1;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 334, 64, 36};
        for (int i = 0, n = numbers.length; i < n; i++) {
            numbers[i] = (int) (Math.random() * 10);

        }
        for (int temp : numbers) {
            System.out.println(" " + temp);
        }
        int count = 0, sum = 0;
        for (int i = 0, n = numbers.length; i < n; i++) {
            if (i % 2 == 0) {
                count++;
                sum = sum + numbers[i];
            }
        }
        System.out.println("Количество: " + count + " \nСумма: " + sum);
    }
}
