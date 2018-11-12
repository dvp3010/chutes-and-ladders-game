package com.candidate.priceline.chutes.and.ladders.game.models;

import java.util.Random;

/**
 * This class represents Spinner in this game to get random numbers between 1-6
 * inclusive
 *
 */
public class Spinner {
	private static Random random = new Random();

	private Spinner() {
		// prevent useless construction
	}

	/**
	 * This method returns spinNumber between 1-6 inclusive
	 * 
	 * @return random spinNumber between 1-6 inclusive
	 */
	public static int spin() {
		return random.nextInt(6) + 1;
	}
}
