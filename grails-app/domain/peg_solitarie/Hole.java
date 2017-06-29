package peg_solitarie;
import peg_solitarie.Peg;

public class Hole {
	Peg peg;
	int state; 
	// 0 no accessible
	// 1 empty
	// 2 has peg
	
	public Hole() {
		this.peg = new Peg();
		this.state = 1 ;
	}
	
	public Hole(Peg peg, int state) {
		this.peg = peg;
		this.state = state;
	}
	
	
}
