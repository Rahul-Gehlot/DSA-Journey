package Part_3_Functions;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
//        Any Base to any base
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        Source Base
        int s = sc.nextInt();
//        Destination Base
        int d = sc.nextInt();

        int ans = anyBaseToAnyBase(n, s, d);
        System.out.println(ans);
    }

    private static int anyBaseToAnyBase(int n, int s, int d) {
        int dec = sourceToDecimal(n, s);
        int dest = decimalToDestination(dec, d);
        return dest;
    }

    private static int decimalToDestination(int n, int d) {
        int ans = 0;
        int p = 1;
        while (n > 0){
            int rem = n % d;
            n = n / d;
            ans = ans + rem * p;
            p = p * 10;
        }
        return ans;
    }

    private static int sourceToDecimal(int n, int s) {
        int ans = 0;
        int p = 1;
        while (n > 0){
            int rem = n % 10;
            n = n / 10;
            ans = ans + rem * p;
            p = p * s;
        }
        return ans;
    }
}
