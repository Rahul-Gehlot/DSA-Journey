package Part_3_Functions;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
//        AnyBase Addition
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int ans = anyBaseAddition(n, n1, n2);
        System.out.println(ans);
    }

    private static int anyBaseAddition(int n, int n1, int n2) {
        int ans = 0;
        int c = 0;  //Carry initialized with 0
        int p = 1;
        while (n1 > 0 || n2 > 0 || c > 0){
//            Getting the last digits from the numbers
            int d1 = n1 % 10;
            int d2 = n2 % 10;
//            Making the number short
            n1 = n1 / 10;
            n2 = n2 / 10;
//            Storing the sum of remainders wit carry
            int sum = d1 + d2 + c;
//            checking the if the number is smaller or bigger than the base
            c = sum / n;
            sum = sum % n;
            ans = ans + sum * p;
            p = p * 10;
        }
        return ans;
    }
}
