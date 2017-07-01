package peg_solitarie;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoveTest {
/*
	@Test
	public void checkFirstCanMove() {
		Move move = new Move("1,3,2,2,2,3,2,4,3,3,4,3");
		assertTrue(move.canMove(3, 3));
	}

	@Test
	public void checkSecondCanMove() {
		Move move = new Move("1,3,2,2,2,3,2,4,3,3,4,3");
		assertFalse(move.canMove(0, 0));
	}

	@Test
	public void checkThirdCanMove() {
		Move move = new Move("1,3,2,2,2,3,2,4,3,3,4,3");
		assertFalse(move.canMove(2, 0));
	}

	@Test
	public void checkFirstCalcHorizontalVertical() {
		Move move = new Move("1,3,2,2,2,3,2,4,3,3,4,3");
		assertEquals(0, move.calcHorizontalVertical(0, 1, 0, 2));
	}

	@Test
	public void checkSecondCalcHorizontalVertical() {
		Move move = new Move("1,3,2,2,2,3,2,4,3,3,4,3");
		assertEquals(1, move.calcHorizontalVertical(1, 3, 2, 3));
	}

	@Test
	public void checkThirdCalcHorizontalVertical() {
		Move move = new Move("1,3,2,2,2,3,2,4,3,3,4,3");
		assertEquals(2, move.calcHorizontalVertical(0, 2, 1, 3));
	}
	
	@Test
	public void checkPositiveMovePegHor(){
		Move move = new Move("1,3,2,2,2,3,2,4,3,3,4,3");
		move.movePeg("b23", "b25");
		assertEquals(1, move.getOwnerHole(2, 3));
		assertEquals(1, move.getOwnerHole(2, 4));
		assertEquals(2, move.getOwnerHole(2, 5));
	}

	@Test
	public void checkNegativeMovePegHor(){
		Move move = new Move("1,3,2,2,2,3,2,4,3,3,4,3");
		move.movePeg("b23", "b21");
		assertEquals(1, move.getOwnerHole(2, 3));
		assertEquals(1, move.getOwnerHole(2, 2));
		assertEquals(2, move.getOwnerHole(2, 1));
	}

	@Test
	public void checkPositiveFalseMovePegHor(){
		Move move = new Move("1,3,2,2,2,3,2,4,3,3,4,3");
		move.movePeg("b33", "b35");
		assertEquals(2, move.getOwnerHole(3, 3));
		assertEquals(1, move.getOwnerHole(3, 4));
		assertEquals(1, move.getOwnerHole(3, 5));
	}

	@Test
	public void checkNegativeFalseMovePegHor(){
		Move move = new Move("1,3,2,2,2,3,2,4,3,3,4,3");
		move.movePeg("b43", "b41");
		assertEquals(2, move.getOwnerHole(4, 3));
		assertEquals(1, move.getOwnerHole(4, 2));
		assertEquals(1, move.getOwnerHole(4, 1));
	}
	
	@Test
	public void checkPositiveMovePegVer(){
		Move move = new Move("1,3,2,2,2,3,2,4,3,3,4,3");
		move.movePeg("b33", "b53");
		assertEquals(1, move.getOwnerHole(3, 3));
		assertEquals(1, move.getOwnerHole(4, 3));
		assertEquals(2, move.getOwnerHole(5, 3));
	}

	@Test
	public void checkNegativeMovePegVer(){
		Move move = new Move("1,3,2,2,2,3,2,4,3,3,4,3");
		move.movePeg("b23", "b03");
		assertEquals(1, move.getOwnerHole(2, 3));
		assertEquals(1, move.getOwnerHole(1, 3));
		assertEquals(2, move.getOwnerHole(0, 3));
	}
	
	@Test
	public void checkWinningGame(){
		Move move = new Move("1,3,2,2,2,3,2,4,3,3,4,3");
		move.movePeg("b23", "b25");
		move.movePeg("b43", "b23");
		move.movePeg("b22", "b24");
		move.movePeg("b25", "b23");
		move.movePeg("b13", "b33");
		assertTrue(move.conditionWin());
	}

	@Test
	public void checkResetBoard(){
		Move move = new Move("1,3,2,2,2,3,2,4,3,3,4,3");
		move.movePeg("b23", "b25");
		move.showBoard();
		move.resetBoard();
		move.showBoard();
		assertEquals(1, move.getOwnerHole(2, 5));
	}
*/	
}
