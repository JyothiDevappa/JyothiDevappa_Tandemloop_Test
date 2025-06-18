package com.tandemloop.problems;
import java.util.*;


public class Problem3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        int num = 1;

        while (count < a) {
            if (num <= a) {
                System.out.print(num);
                count++;
                if (count < a && (num + 2) <= a) {
                    System.out.print(", ");
                }
            } else {
                break;
            }
            num += 2;
        }

        sc.close();
    }
}
