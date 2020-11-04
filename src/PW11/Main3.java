package PW11;

public class Main3 {
        public static void main(String[] args) {
            int [] x={2,-4,1,4,9,-3,2,6,7,5,-2};
            int max=(int)Double.NEGATIVE_INFINITY;
            int min=(int)Double.POSITIVE_INFINITY;

            int indexMin=x.length-1;
            int indexMax=indexMin;
            for (int i=0;i<x.length;i++){
                if (x[i]>max){
                    max=x[i];
                    indexMax=i;
                }
                if(x[i]<min){
                    min=x[i];
                    indexMin=i;
                }
            }
            int count=0;
            for (int temp:x){
                if(temp==max||temp==min){
                    count++;
                }
            }
            int[]res=new int[x.length-count+2];
            int j=0;
            for(int i=0;i<x.length;i++){
                if (x[i]!=min&&x[i]!=max){
                    res[j++]=x[i];
                }else{
                    if(i==indexMax||i==indexMin){
                        res[j++]=x[i];
                    }
                }
            }
            for(int temp:res){
                System.out.print(temp+" ");
            }
        }

    }