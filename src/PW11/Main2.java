package PW11;

public class Main2 {public static void main(String[] args) {
        int [] x={1,5,-6,76,-6,-243,54,-34,32,23,567,-3,98,32,35,65,24};
        int count=0;
        int k=0;
        int b=0;
        for(int temp:x){
            if(temp<0){
                count++;
            }
        }
        int[] y = new int[count];
        int[] z = new int[x.length-count];
        for (int temp:x){
            if(temp>0){
                z[k]=temp;
                k++;
            }else{
                y[b]=temp;
                b++;
            }
        }
        for(int m1:z){
            System.out.println(m1+" ");
        }
        System.out.println();
    System.out.println("-----");
        for(int m2:y){
            System.out.println(m2+" ");
        }
    }

}