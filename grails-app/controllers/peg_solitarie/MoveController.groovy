package peg_solitarie

class MoveController {
	
	def movement(){
		String fromM = params.fromM
		String toM = params.toM
		String initial = "1,3,2,2,2,3,2,4,3,3,4,3"
		def move = new Move(initial);
		move.movePeg(fromM, toM);
	}
}
