package peg_solitarie;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	@Test
	public void basicConfiguration() {
		Board board = new Board();
		int score = board.evaluateBoard();
		assertEquals(6, score);
	}

	@Test
	public void otherConfiguration() {
		Board board = new Board();
		board.setOwnerHole(2, 2, 1);
		board.setOwnerHole(3, 1, 1);
		board.setOwnerHole(3, 2, 1);
		board.setOwnerHole(3, 4, 1);
		int score = board.evaluateBoard();
		assertEquals(2, score);
	}

	@Test
	public void evaluateWinning() {
		Board board = new Board();
		board.setOwnerHole(2, 2, 1);
		board.setOwnerHole(3, 1, 1);
		board.setOwnerHole(3, 2, 1);
		board.setOwnerHole(3, 4, 1);
		board.setOwnerHole(4, 2, 1);
		int score = board.evaluateBoard();
		assertTrue(board.conditionWin());
	}

	@Test
	public void checkSetOwnerHole() {
		Board board = new Board();
		board.setOwnerHole(2, 2, 1);
		int score = board.evaluateBoard();
		assertEquals(5, score);
	}

}
