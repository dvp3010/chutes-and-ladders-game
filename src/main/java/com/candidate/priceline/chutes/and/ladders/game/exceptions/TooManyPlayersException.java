package com.candidate.priceline.chutes.and.ladders.game.exceptions;

/**
 * This is checked exception for situation when there are too many players for
 * playing this game.
 */
public class TooManyPlayersException extends Exception {
	private static final long serialVersionUID = -1866290438352338906L;

	public TooManyPlayersException(String message) {
		super(message);
	}
}
