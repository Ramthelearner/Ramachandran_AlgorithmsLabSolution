package com.greatlearning.lab;

import java.util.Scanner;

public class Transactions {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {

		// get the size of transactions from user - 3
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		// allocate an array of the size given by user
		int array[] = new int[size];
		// iterate through the loop to get the values of the transactions - 10, 20,30
		System.out.println("Enter the  values of transaction array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		// get the number of targets
		System.out.println("Enter the total number of targets that needs to be achieved");
		int numtargets = sc.nextInt();

		// loop as many times as we get the number of targets
		for (int i = 0; i < numtargets; i++) {
			// get the target
			System.out.println("Enter the value of target");
			int target = sc.nextInt();
			// again start the loop to calculate the number of transactions
			int sum = 0;
			for (int j = 0; j < array.length; j++) {
				// sum till the element
				sum = sum + array[i];

				// check if the target is reached or not
				if (sum >= target) {
					System.out.println("Target is achieved after " + (j + 1) + " transactions");
					break;
				}
				if (j == array.length - 1 && sum < target) {
					System.out.println("Target is not achieved");
				}
			}
			// check whether the target is achieved
			System.out.println();

		}
	}
}
