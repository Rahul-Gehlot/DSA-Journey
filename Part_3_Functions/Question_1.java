package Part_3_Functions;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
//        Digit frequency
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int ans = DigitFrequency(n , d);
        System.out.println(ans);
    }

    private static int DigitFrequency(int n, int d) {
        int count = 0;
        while (n != 0){
            int rem = n % 10;       //Getting the last digit
            n = n / 10;     //Making the number short
            if(d == rem)
                count++;
        }
        return count;
    }
}
