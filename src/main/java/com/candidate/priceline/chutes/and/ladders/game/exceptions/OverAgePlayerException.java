package com.candidate.priceline.chutes.and.ladders.game.exceptions;

/**
 * This is runtime exception for situation when player's age is over restricted
 * range.
 */
public class OverAgePlayerException extends RuntimeException {
	private static final long serialVersionUID = 5550398524333844138L;

	public OverAgePlayerException(String message) {
		super(message);
	}
}
