package Part_3_Functions;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
//        Any base to decimal
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int ans = anyBaseToDecimal(n , b);
        System.out.println(ans);
    }

    private static int anyBaseToDecimal(int n, int b) {
        int ans = 0;
        int p = 1;
        while (n > 0){
            int rem = n % 10;
            n = n / 10;
            ans = ans + rem * p;
            p = p * b;
        }
        return ans;
    }
}
