package javaArray;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random Rnd = new Random();
	
		int min = 1, max = 100;
		int ranNumber = Rnd.nextInt(min, max);
		System.out.println(ranNumber);	
	}

}
