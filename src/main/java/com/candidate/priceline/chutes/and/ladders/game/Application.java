package com.candidate.priceline.chutes.and.ladders.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.candidate.priceline.chutes.and.ladders.game.core.ChutesAndLaddersGame;
import com.candidate.priceline.chutes.and.ladders.game.core.Game;
import com.candidate.priceline.chutes.and.ladders.game.exceptions.NotEnoughPlayersException;
import com.candidate.priceline.chutes.and.ladders.game.exceptions.OverAgePlayerException;
import com.candidate.priceline.chutes.and.ladders.game.exceptions.TooManyPlayersException;
import com.candidate.priceline.chutes.and.ladders.game.exceptions.UnderAgePlayerException;
import com.candidate.priceline.chutes.and.ladders.game.models.Player;

/**
 * Main class for this application which reads the input from console to create
 * list of players and than call game with list of players to start playing
 */
public class Application {
	private static final String INPUT_PROMPT_1 = "please enter player name and age delimited by comma i.e Dhruv,5:";
	private static final String INPUT_PROMPT_2 = "Do you want add another player[Y]? type 'N' and press enter to start the game.";
	private static List<Player> players;

	/**
	 * Main Entry Point in the application
	 * 
	 * @param args
	 * @throws NotEnoughPlayersException
	 * @throws TooManyPlayersException
	 */
	public static void main(String[] args) throws NotEnoughPlayersException, TooManyPlayersException {
		addPlayersFromConsoleInput();
		Game game = new ChutesAndLaddersGame();
		System.out.println(String.format("Players playing game : %s", players));
		game.startPlay(players);
	}

	/**
	 * read input from console to build players list.
	 */
	private static void addPlayersFromConsoleInput() {
		try (Scanner scanner = new Scanner(System.in)) {
			players = new ArrayList<>();
			System.out.println(INPUT_PROMPT_1);
			while (scanner.hasNextLine()) {
				Player p = createPlayer(scanner.nextLine().split(","));
				if (p != null) {
					players.add(p);
					System.out.println(String.format("%s has been added. players : %s%n", p, players));
					System.out.println(INPUT_PROMPT_2);
					if ("N".equalsIgnoreCase(scanner.nextLine())) {
						break;
					}
					System.out.println(INPUT_PROMPT_1);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * creates player object from provide playerInfo
	 * 
	 * @param playerInfo
	 * @return Player if pass all validation else null
	 */
	private static Player createPlayer(String[] playerInfo) {
		Player player = null;
		try {
			player = new Player(playerInfo[0], Integer.parseInt(playerInfo[1]));
		} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
			System.out.println("ERROR : player cannot be added. please enter valid player input.");
			System.out.println(INPUT_PROMPT_1);
		} catch (NumberFormatException numberFormatException) {
			System.out
					.println(String.format("ERROR : player cannot be added. age '%s' must be number.", playerInfo[1]));
			System.out.println(INPUT_PROMPT_1);
		} catch (UnderAgePlayerException underAgePlayerException) {
			System.out
					.println(String.format("ERROR : player cannot be added. %s", underAgePlayerException.getMessage()));
			System.out.println(INPUT_PROMPT_1);
		} catch (OverAgePlayerException overAgePlayerException) {
			System.out
					.println(String.format("ERROR : player cannot be added. %s", overAgePlayerException.getMessage()));
			System.out.println(INPUT_PROMPT_1);
		}
		return player;
	}
}
