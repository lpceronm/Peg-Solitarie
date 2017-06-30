package peg_solitarie;

public class Move {

	private Board gameBoard;

	public Move(String initial) {
		this.gameBoard = new Board(initial);
	}
	
	public void movePeg(String fromM, String toM) {
		char[] from1 = fromM.substring(1).toCharArray();
		char[] to1 = toM.substring(1).toCharArray();
		int x1 = Character.getNumericValue(from1[0]);
		int x2 = Character.getNumericValue(to1[0]);
		int y1 = Character.getNumericValue(from1[1]);
		int y2 = Character.getNumericValue(to1[1]);
		if (calcHorizontalVertical(x1,y1,x2,y2) == 0){
			int newY = position(y1,y2);
			updateBoard(x1, y1, y2, newY, 0);
		} else {
			int newX = position(x1,x2);
			updateBoard(y1, x1, x2, newX, 1);
		}
		if (gameBoard.conditionWin()) System.out.println("Ganaste");
	}
	
	public int  calcHorizontalVertical(int x1, int y1, int x2, int y2) {
		if(x1 == x2) {
			return 0;
		} else if(y1 == y2){
			return 1;
		} else {
			return 2;
		}
	}

	public int position (int pos1, int pos2) {
		int result  = pos2 - pos1;
		int pos = -1;
		switch(result) {
			case 2:
				pos = pos1+1;
				break;
			case -2:
				pos = pos2+1;
				break;
			default:
				pos = -1;
		}
		return pos;
	}

	public boolean canMove(int x, int y) {
		return (gameBoard.getOwnerHole(x, y) == 2) ? true: false;
	}
	
	public void updateBoard(int a, int b, int c, int d, int result){
		if (result == 0){
			if (canMove(a, d)){
				gameBoard.setOwnerHole(b, a, 1);
				gameBoard.setOwnerHole(c, a, 2);
				gameBoard.setOwnerHole(d, a, 1);
			}
		} else {
			if (canMove(d, a)){
				gameBoard.setOwnerHole(a, b, 1);
				gameBoard.setOwnerHole(a, c, 2);
				gameBoard.setOwnerHole(a, d, 1);
			}
		}
	}

	public Board getBoard(){
		return this.gameBoard;
	}
	
	public boolean conditionWin(){
		return gameBoard.conditionWin();
	}
	
	public void showBoard(){
		gameBoard.printBoard();
	}
	
	public int getOwnerHole(int x, int y){
		return gameBoard.getOwnerHole(x, y);
	}
	
	public void resetBoard(){
		gameBoard.resetBoard();
	}
}
