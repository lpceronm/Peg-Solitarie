package peg_solitarie;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	@Test
	public void basicConfiguration() {
		Board board = new Board("1,3,2,2,2,3,2,4,3,3,4,3");
		int score = board.evaluateBoard();
		assertEquals(6, score);
	}

	@Test
	public void otherConfiguration() {
		Board board = new Board("1,3,2,2,2,3,2,4,3,3,4,3");
		board.setOwnerHole(2, 2, 1);
		board.setOwnerHole(1, 3, 1);
		board.setOwnerHole(2, 3, 1);
		board.setOwnerHole(4, 3, 1);
		int score = board.evaluateBoard();
		assertEquals(2, score);
	}

	@Test
	public void evaluateWinning() {
		Board board = new Board("1,3,2,2,2,3,2,4,3,3,4,3");
		board.setOwnerHole(2, 2, 1);
		board.setOwnerHole(1, 3, 1);
		board.setOwnerHole(2, 3, 1);
		board.setOwnerHole(4, 3, 1);
		board.setOwnerHole(2, 4, 1);
		assertTrue(board.conditionWin());
	}

	@Test
	public void checkSetOwnerHole() {
		Board board = new Board("1,3,2,2,2,3,2,4,3,3,4,3");
		board.setOwnerHole(2, 2, 1);
		int score = board.evaluateBoard();
		assertEquals(5, score);
	}

	@Test
	public void checkSetOwnerHole2() {
		Board board = new Board("1,3,2,2,2,3,2,4,3,3,4,3");
		board.printBoard();
		board.setOwnerHole(2, 3, 1);
		board.setOwnerHole(2, 5, 2);
		board.setOwnerHole(2, 4, 1);
		board.printBoard();
		int score = board.evaluateBoard();
		assertEquals(5, score);
	}

}
