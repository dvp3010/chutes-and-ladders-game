package com.candidate.priceline.chutes.and.ladders.game.core;

import java.util.List;

import com.candidate.priceline.chutes.and.ladders.game.exceptions.NotEnoughPlayersException;
import com.candidate.priceline.chutes.and.ladders.game.exceptions.TooManyPlayersException;
import com.candidate.priceline.chutes.and.ladders.game.models.GameBoard;
import com.candidate.priceline.chutes.and.ladders.game.models.Player;
import com.candidate.priceline.chutes.and.ladders.game.models.Spinner;

/**
 * Default implementation of Game Interface which implements logic to start
 * playing game
 *
 */
public class ChutesAndLaddersGame implements Game {

	/**
	 * this method mimic the playing of game for provided list of players.
	 * 
	 * it determines who will take turn first. than each player take their turn and
	 * update their current position in game until we have winner.
	 */
	public void startPlay(List<Player> players) throws NotEnoughPlayersException, TooManyPlayersException {

		// perform validation
		if ((players == null) || (players.size() < 2)) {
			throw new NotEnoughPlayersException("to play this game you need atleast 2 players.");
		}
		if (players.size() > 4) {
			throw new TooManyPlayersException("players cannot be morethan 4.");
		}

		// get singleton instance of GameBoard
		GameBoard gameBoard = GameBoard.getInstance();

		// get index of player who will take first turn
		int i = decideWhoWillGoFirst(players);

		int size = players.size();
		// loop through players and let each player take thier turn until we have a
		// winner.
		while (true) {
			Player player = players.get(i % size); // get player in rotating manner
			player.takeATurn(gameBoard); // player is playing their turn
			if (player.isWinner(gameBoard)) {
				break; // break out of the loop if player won.
			}
			i++;
		}
	}

	/**
	 * this method determines based on highest spin number who will take first turn.
	 * and also prints that player's name and spinNumber
	 * 
	 * @param players
	 * @return index of player who will take first turn
	 */
	private int decideWhoWillGoFirst(List<Player> players) {
		int highest = 0;
		int index = 0;
		for (int i = 0; i < players.size(); i++) {
			int playerSpinNum = Spinner.spin();
			if (highest < playerSpinNum) {
				highest = playerSpinNum;
				index = i;
			}
		}
		System.out.println(String.format("%s got highest spin number %s so he/she will take first turn",
				players.get(index).getName(), highest));
		return index;
	}
}
