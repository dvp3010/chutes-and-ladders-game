package com.candidate.priceline.chutes.and.ladders.game.models;

import java.util.HashMap;
import java.util.Map;

/**
 * This singleton class represents GameBoard which has information that defines
 * game board like chute locations, ladder locations and total number of squares
 *
 */
public class GameBoard {
	private static GameBoard instance;
	private int totalNumberOfSquares;
	private Map<Integer, Integer> laddersMap;
	private Map<Integer, Integer> chutesMap;

	/**
	 * private default constructor for intializing this singleton object from within
	 * only.
	 * 
	 * @param totalNumberOfSquares
	 * @param laddersMap
	 * @param chutesMap
	 */
	private GameBoard(int totalNumberOfSquares, Map<Integer, Integer> laddersMap, Map<Integer, Integer> chutesMap) {
		this.totalNumberOfSquares = totalNumberOfSquares;
		this.laddersMap = laddersMap;
		this.chutesMap = chutesMap;
	}

	/**
	 * this method returns singleton instance of gameboard with lazy initializations
	 * 
	 * @return Singleton GameBoard
	 */
	public static GameBoard getInstance() {
		if (instance == null) {
			// default number of squares based on specs
			int totalNumberOfSquares = 100;

			// default positions of ladders based on specs
			Map<Integer, Integer> laddersMap = new HashMap<>();
			laddersMap.put(1, 38);
			laddersMap.put(4, 14);
			laddersMap.put(9, 31);
			laddersMap.put(28, 84);
			laddersMap.put(21, 42);
			laddersMap.put(36, 44);
			laddersMap.put(51, 68);
			laddersMap.put(71, 91);
			laddersMap.put(80, 100);

			// default postions of chutes based on specs
			Map<Integer, Integer> chutesMap = new HashMap<>();
			chutesMap.put(98, 78);
			chutesMap.put(95, 75);
			chutesMap.put(93, 73);
			chutesMap.put(87, 24);
			chutesMap.put(64, 60);
			chutesMap.put(62, 19);
			chutesMap.put(56, 53);
			chutesMap.put(49, 11);
			chutesMap.put(47, 26);
			chutesMap.put(16, 6);

			instance = new GameBoard(totalNumberOfSquares, laddersMap, chutesMap);
		}
		return instance;
	}

	/**
	 * this method checks whether provided square is in GameBoard or not.
	 * 
	 * @param square
	 * @return true if provided square is in GameBoard
	 */
	public boolean isValidSquare(int square) {
		return square <= this.totalNumberOfSquares;
	}

	/**
	 * this method checks whether provided square is winning square or not.
	 * 
	 * @param square
	 * @return true if provided square is winning square
	 */
	public boolean isWinningSquare(int square) {
		return totalNumberOfSquares == square;
	}

	/**
	 * this method checks whethe provided square has a ladder bottom or not.
	 * 
	 * @param square
	 * @return true if provided square has a ladder bottom.
	 */
	public boolean hasLadderBottom(int square) {
		return laddersMap.containsKey(square);
	}

	/**
	 * this method returns ladder top square for provided ladder bottom square.
	 * 
	 * @param square
	 * @return ladder top square
	 */
	public Integer getLadderTop(int square) {
		return laddersMap.get(square);
	}

	/**
	 * this method checks whether provided square has chute a top or not.
	 * 
	 * @param square
	 * @return true if provided square has a chute top
	 */
	public boolean hasChuteTop(int square) {
		return chutesMap.containsKey(square);
	}

	/**
	 * this method returns chute bottom square for provided chute top square.
	 * 
	 * @param square
	 * @return chute bottom square
	 */
	public Integer getChuteBottom(int square) {
		return chutesMap.get(square);
	}
}
