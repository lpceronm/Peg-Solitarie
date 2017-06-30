package peg_solitarie;

public class Hole {
	private int state;
	// 0 no accessible
	// 1 empty
	// 2 has peg

	public Hole() {
		this.state = 1;
	}

	public Hole(int state) {
		this.state = state;
	}

    public static Hole getDefault() {
        return new Hole(1);
    }

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
}
