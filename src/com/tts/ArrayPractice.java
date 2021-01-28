package com.tts;

import java.util.Arrays;

public class ArrayPractice {

	// 1.Write a program to sum the values of a given Array.
    public static void main(String[] args) {
	int[] my_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int sum = 0;

	for (int i : my_array) {
		sum += i;
	}
	System.out.println("The sum of values is " + sum);

	toPower(4, 2);

    }

    // 3. Write a public static method called "toPower"
	// that takes in as parameters two integers called size and power.
	public static void toPower(int size, int power) {

    	Integer[] powerArray = new Integer[size];
    	for(int i = 0; i < size; i++) {
    		powerArray[i] = (int) Math.pow(i, power);
		}
    	System.out.println(Arrays.toString(powerArray));
	}
}
