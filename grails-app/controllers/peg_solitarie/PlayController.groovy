package peg_solitarie

class PlayController {

//public Board gameBoard;
	
    def index() { }
	
	def init() {
		this.gameBoard = new Board();
		gameBoard.printBoard();
	}
	
	def start() {
		
	}
	
	def restart() {
		
	}
	
	def undo() {
		
	}
	
	def movement() {
		print("here?")
		/*String fromM = params.fromM
		String toM = params.toM
		
		print(fromM)
		print(toM)
		
		char[] from1 = fromM.toCharArray();
		char[] to1 = toM.toCharArray();
		int result = hori_vertical(from1, to1);
		
		switch (result) {
			case 0:
				
				
				break;
	
			case 1:
				
				break;
		}
		*/

		render 'hola'
		
	}
	
	
	private int  hori_vertical(char[] fromM, char[] toM) {
		if(fromM[0].equals(toM[0])) {
			return 0;
		}else if(fromM[1].equals(toM[1])){
			return 1;
		}	
	}
	
	def hola() {
		print("si llegue aqui")
		print(params.id)
		
	}
}
