package baekjoon;

import java.util.Scanner;

public class bj10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int[] arr = new int[t];
        int cnt = 0;

        for(int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }

        int n = sc.nextInt();

        for(int i = 0; i < arr.length; i++) {
            if (n == arr[i]){
                cnt++;
            }
        }

        System.out.println(cnt);


    }
}
