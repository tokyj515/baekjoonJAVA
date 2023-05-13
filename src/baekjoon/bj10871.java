package baekjoon;

import java.util.Scanner;

public class bj10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int num = sc.nextInt();
        int arr[] = new int[t];

        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < t; i++) {
            if (arr[i] < num) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
