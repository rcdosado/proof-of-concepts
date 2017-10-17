/**
 * 
 */
package oop;

import java.util.ArrayList;

/**
 * @author m1k3y
 *
 */
public class Moves {
	
	private ArrayList<String> moves;

	/**
	 * @return the moves
	 */
	public ArrayList<String> getMoves() {
		return moves;
	}

	/**
	 * @param moves the moves to set
	 */
	public void add(String move) {
		if (moves.contains(move))
			return;
		moves.add(move);
	}

}
