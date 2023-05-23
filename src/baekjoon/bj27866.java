package baekjoon;

import java.util.Scanner;

public class bj27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s = sc.next().split("");
        int n = sc.nextInt();

        sc.close();

        System.out.println(s[n-1]);
    }
}
