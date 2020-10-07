package loop2part2.lesson23;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            if (1 % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }
        return;
    }
}
