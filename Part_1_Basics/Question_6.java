package Part_1_Basics;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
//        Program to Print all Prime till n

        Scanner sc = new Scanner(System.in);
        int lo = sc.nextInt();
        int hi = sc.nextInt();

//        loop in range of lo to hi
        for(int n = lo; n <= hi; n++){
            int count = 0;
            for(int div = 2; div * div <= n; div++){
                if(n % div == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println(n);
            }
        }
    }
}
