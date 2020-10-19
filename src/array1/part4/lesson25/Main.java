package array1.part4.lesson25;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {21, 6, 48, 90, 34};
        int sum = 0;
        for (int number : myArray){
            sum = sum + number;
            number = 100;
            }
            System.out.println("Sum = " + sum);
        System.out.println(myArray[1]);
        }
    }