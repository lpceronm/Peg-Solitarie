package peg_solitarie

class PlayController {

	int newX, newY, oldX, oldY;
	Board gameBoard = new Board();
//	
//    def index() { }
//	
////	def init() {
////		this.gameBoard = new Board();
////		gameBoard.printBoard();
////	}
//	
//	def start() {
//		
//	}
//	
//	def restart() {
//		
//	}
//	
//	def undo() {
//		
//	}
	
	def movement() {
	
		
		String fromM = params.fromM
		String toM = params.toM
		
//		print(fromM)
//		print(toM)
//		
		
		char[] from1 = fromM.substring(1).toCharArray();
		char[] to1 = toM.substring(1).toCharArray();
		
		
		
		int x1 = Character.getNumericValue(from1[1])
		int x2 = Character.getNumericValue(to1[1])
		int y1 = Character.getNumericValue(from1[0])
		int y2 = Character.getNumericValue(to1[0])
		
		
	  
		
		int result = hori_vertical(x1,x2,y1,y2);
		switch (result) {
			case 0:
				newY = position(y1,y2)
				newX = x1
			
				oldY = y2
				updateBoard(newX, newY, oldY, result)
				break;
			case 1:
				newX = position(x1,x2)
				newY = y1
				oldX = x2
				updateBoard(newX, newY, oldX, result)
				break;
		}
		
		this.gameBoard.printBoard()
	    print "==========="
		
	}
	
	
	private int  hori_vertical(int x1, int x2, int y1, int y2) {
		if(x1 == x2) {
			return 0;
		}else if(y1 == y2){
			return 1;
		}
	}

	private int position (int pos1, int pos2) {
		int result  = pos2 - pos1
		int pos = -1
		switch(result) {
			case 2:
				pos = pos1+1
				break;
			case -2:
				pos = pos2+1
				break;
			default:
				pos = -1
		}
		return pos
	}

	private boolean canMove(int x, int y) {
		
		
		Hole hole = this.gameBoard.board[x][y]
		boolean move = (hole.state == 2) ? true: false
		return move
	}
	
	private void updateBoard(int newX, int newY, int oldZ, int result){
	
		if (canMove(newX, newY)){
			this.gameBoard.board[newX][newY].setState(1)
			
			if (result){
				this.gameBoard.board[newX][oldZ].setState(2)
			} else {
				
				this.gameBoard.board[oldZ][newY].setState(2)
			}
		}
	}
}
