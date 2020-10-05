package loop1part2.lesson20;

public class Main {
    public static void main(String[] args) {
        int balance = 1000;
        int goal = 2000;
        int rate = 11;
int years = 0;
        while(balance<goal){
            double profit = balance * rate / 100;
            balance += profit;
            years++;
            System.out.println("Накопили" + balance + "за" + years +"лет");
        }
    }
}
