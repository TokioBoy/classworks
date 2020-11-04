package PW9;
public class Main1 {
        public static void main(String[] args) {
            int[] z = {1,7,34,65,39,35,8,345};
            int min = (int) Double.POSITIVE_INFINITY;
            int max = (int) Double.NEGATIVE_INFINITY;
            for (int i = 0, n = z.length; i < n; i++) {
                if (min > z[i]) {
                    min = z[i];

                }
                if (max < z[i]) {
                    max = z[i];

                }
            }
            System.out.println("Минимум: "+ min+"\nМаксимум:"+max);
        }

    }