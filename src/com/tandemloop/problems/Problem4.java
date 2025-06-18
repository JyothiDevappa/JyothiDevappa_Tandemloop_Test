package com.tandemloop.problems;
import java.util.*;

public class Problem4 {

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        int[] arr = new int[11];
		        for (int i = 0; i < arr.length; i++) {
		            arr[i] = sc.nextInt();
		        }

		        Map<Integer, Integer> map = new HashMap<>();

		        for (int i = 1; i <= 9; i++) {
		            map.put(i, 0);
		        }

		        for (int i = 1; i <= 9; i++) {
		            int count = 0;
		            for (int num : arr) {
		                if (num % i == 0) {
		                    count++;
		                }
		            }
		            map.put(i, count);
		        }

		        System.out.println(map);
		        sc.close();
		    }
		}
