package Part_1_Basics;

import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {
//        Program to rotate a number       //
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

//        Creating a variable temp so that the value of n is not destroyed.
        int temp = n;
        int digit = 0;

//        Finding the number of digits in a number
        while(temp != 0){
            temp = temp / 10;
            digit++;
        }

//        Dealing with the special cases
//        1. If r > digit
        r = r % digit;

//        2. If r < 0
        if(r < 0){
            r = r + digit;
        }
        int div = 1;
        int mul = 1;
        for(int i = 1; i <= digit; i++){
            if(i <= r){
                div = div * 10;
            }else{
                mul = mul * 10;
            }
        }

        int q = n / div;
        int rem = n % div;
        int rot = rem * mul + q;
        System.out.println(rot);
    }
}
