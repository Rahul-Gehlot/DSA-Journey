package Part_3_Functions;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
//        Any Base to Subtraction
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
//        n2 should be greater than n1

        int ans = anyBaseSub(b, n1, n2);
        System.out.println(ans);
    }

    private static int anyBaseSub(int b, int n1, int n2) {
        int ans = 0;
        int p = 1;
        int c = 0;
        while (n2 > 0){
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int sub = 0;
            d2 = d2 + c;

            if(d2 >= d1){
                c = 0;
                sub = d2 - d1;
            }else {
                c = -1;
                sub = d2 + b - d1;
            }

            ans = ans + sub * p;
            p = p * 10;
        }
        return ans;
    }
}
