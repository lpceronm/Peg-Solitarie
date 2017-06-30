package peg_solitarie



class PlayController {

	def movement() {
		String fromM = params.fromM
		String toM = params.toM
		
		Move move = new Move();
		move.movePeg(fromM, toM);
	}
}
