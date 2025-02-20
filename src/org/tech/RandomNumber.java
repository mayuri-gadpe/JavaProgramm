package org.tech;

import java.util.Arrays;
import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		
		Random r = new Random();
		
		for (int i = 0; i < array.length; i++) {
			int randomSwap = r.nextInt(array.length);
			int temp = array[randomSwap];
			array[randomSwap] = array[i];
			array[i] = temp;
		}
		System.out.println(Arrays.toString(array));
	}

}
