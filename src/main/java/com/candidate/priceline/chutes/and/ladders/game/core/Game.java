package com.candidate.priceline.chutes.and.ladders.game.core;

import java.util.List;

import com.candidate.priceline.chutes.and.ladders.game.exceptions.NotEnoughPlayersException;
import com.candidate.priceline.chutes.and.ladders.game.exceptions.TooManyPlayersException;
import com.candidate.priceline.chutes.and.ladders.game.models.Player;

/**
 * Game interface to start playing the game.
 */
public interface Game {
	/**
	 * this method mimics playing of this game with provided list of players. each
	 * player takes their turn based on logic until we have winner.
	 * 
	 * @param players
	 * @throws NotEnoughPlayersException
	 * @throws TooManyPlayersException
	 */
	public void startPlay(List<Player> players) throws NotEnoughPlayersException, TooManyPlayersException;
}
