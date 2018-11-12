package com.candidate.priceline.chutes.and.ladders.game.models;

import com.candidate.priceline.chutes.and.ladders.game.exceptions.OverAgePlayerException;
import com.candidate.priceline.chutes.and.ladders.game.exceptions.UnderAgePlayerException;

/**
 * this class represents player in the game which has name, age, current square
 * where player is in the game
 * 
 *
 */
public class Player {
	private String name;
	private int age;
	private int currentSquare;

	/**
	 * Default constructor using name and age of player
	 * 
	 * @param name
	 * @param age
	 * 
	 * @throws UnderAgePlayerException when player's age is below 4
	 * @throws OverAgePlayerException  when player's age is over 7
	 */
	public Player(String name, int age) {
		if (age < 4) {
			throw new UnderAgePlayerException(String.format(
					"player %s cannot play this game because this game contains small part which is CHOKING HAZARD for childer under age 3",
					name));
		}
		if (age > 7) {
			throw new OverAgePlayerException(String
					.format("player %s cannot play this game because this game is designed for 4-7 age group", name));
		}
		this.name = name;
		this.age = age;
		this.currentSquare = 0;
	}

	/**
	 * this method mimics when player take their turn and updates their current
	 * square position in the game. and prints outcome of player's turn.
	 * <p>
	 * player spins the spinner to get their spinNumber for this turn. and adds this
	 * spinNumber to their current square
	 * </p>
	 * <ul>
	 * <li>if resulted square is not in gameBoard than do not update current square
	 * position</li>
	 * <li>if resulted square has a ladder bottom than get ladder top for that
	 * ladder and update player's current square to ladder top</li>
	 * <li>if resulted square has a chute top than get chute bottom for that ladder
	 * and update player's current square to chute bottom</li>
	 * <li>if resulted square does not have ladder bottom or chute top than updare
	 * player's current square to resulted square
	 * </ul>
	 * 
	 * @param gameBoard
	 */
	public void takeATurn(GameBoard gameBoard) {
		int spinNumber = Spinner.spin();

		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%-10s spin_outcome:%s", name, Integer.valueOf(spinNumber)));
		sb.append(" : ");
		sb.append(String.format("%3s", Integer.valueOf(currentSquare)));
		int nextSquare = this.currentSquare + spinNumber;
		if (gameBoard.isValidSquare(nextSquare)) {
			sb.append(" --> ");
			sb.append(String.format("%3s", Integer.valueOf(nextSquare)));
			if (gameBoard.hasLadderBottom(nextSquare)) {
				nextSquare = gameBoard.getLadderTop(nextSquare).intValue();
				sb.append(" --LADDER--> ");
				sb.append(String.format("%3s", Integer.valueOf(nextSquare)));
			} else if (gameBoard.hasChuteTop(nextSquare)) {
				nextSquare = gameBoard.getChuteBottom(nextSquare).intValue();
				sb.append(" --CHUTE--> ");
				sb.append(String.format("%3s", Integer.valueOf(nextSquare)));
			}
			currentSquare = nextSquare;
		}
		System.out.println(sb.toString());
	}

	/**
	 * this method checks whether player is at winning sqaure or not. and prints
	 * winner name if player is winner.
	 * 
	 * @param gameBoard
	 * @return true if player is at winning sqaure
	 */
	public boolean isWinner(GameBoard gameBoard) {
		if (gameBoard.isWinningSquare(this.currentSquare)) {
			System.out.println(String.format("The winner is %s !", name));
			return true;
		}
		return false;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public int getCurrentSquare() {
		return this.currentSquare;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Player [name=");
		builder.append(this.name);
		builder.append(", age=");
		builder.append(this.age);
		builder.append("]");
		return builder.toString();
	}
}
