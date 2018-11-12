package com.candidate.priceline.chutes.and.ladders.game.exceptions;

/**
 * This is runtime exception for situation when player's age is under restricted
 * range.
 */
public class UnderAgePlayerException extends RuntimeException {
	private static final long serialVersionUID = 4297331487300389056L;

	public UnderAgePlayerException(String message) {
		super(message);
	}
}
