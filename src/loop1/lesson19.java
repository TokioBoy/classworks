package loop1;

public class lesson19 {
    public static void main(String[] args) {
         for (int i = 0 ; i < 10 ;i++ ) { //счетчик условие по дефолту
             System.out.println("Hello , world." + i);
         }
        for (int i = 4; i < 9 ; i++) {
            System.out.println("Number : " + i);
            
        }
        for (int i = 4; i > 0 ; i--) {
            System.out.println("Number : " + i);
            
        }
        // int i = 4
        //4 > 0 -  true
        //sout 4
        //i-- i =3
        //3 > 0 = true
        //sout 3
        //i-- i=2
        // ...
        int i = 0;
        int j = 1;

//example
        int k = 0;
        for (k = k+2; k < 5 ; k++) {
            
        }
        //example 2
        for (i++, j++; i+j < 5 ; i++) {
            
        } }

}
