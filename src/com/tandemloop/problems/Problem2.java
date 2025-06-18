package com.tandemloop.problems;
import java.util.Scanner;


	 public class Problem2 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int num = 1;

	        for (int i = 1; i <= a; i++) {
	            System.out.print(num);
	            if (i < a) {
	                System.out.print(", ");
	            }
	            num += 2;
	        }

	        sc.close();
	    }
	
}
