package com.candidate.priceline.chutes.and.ladders.game.exceptions;

/**
 * This is checked exception for situation when there are not enough players for
 * playing this game.
 */
public class NotEnoughPlayersException extends Exception {
	private static final long serialVersionUID = 6347774081083655417L;

	public NotEnoughPlayersException(String message) {
		super(message);
	}
}
