package peg_solitarie;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoveTest {

	@Test
	public void checkCanMove() {
		Move move = new Move();
		assertTrue(move.canMove(3, 3));
		assertFalse(move.canMove(0, 0));
		assertFalse(move.canMove(2, 0));
	}

	@Test
	public void checkHorVertical() {
		Move move = new Move();
		assertEquals(0, move.horiVertical(0, 0, 1, 2));
		assertEquals(1, move.horiVertical(1, 2, 3, 3));
		assertEquals(2, move.horiVertical(1, 2, 3, 4));
	}

	@Test
	public void checkMovePegHor(){
		Move move = new Move();
		move.movePeg("b32", "b52");
		assertEquals(1, move.getOwnerHole(2, 3));
		assertEquals(2, move.getOwnerHole(2, 5));
		assertEquals(1, move.getOwnerHole(2, 4));
	}

	@Test
	public void checkMovePegVer(){
		Move move = new Move();
		move.movePeg("b33", "b35");
		assertEquals(1, move.getOwnerHole(3, 3));
		assertEquals(1, move.getOwnerHole(4, 3));
		assertEquals(2, move.getOwnerHole(5, 3));
	}

}
