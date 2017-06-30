package peg_solitarie;

import static org.junit.Assert.*;

import org.junit.Test;

public class HoleTest {

	@Test
	public void checkSetState() {
		Hole hole = new Hole();
		int state = 2;
		hole.setState(state);
		assertEquals(2, hole.getState());
	}

	@Test
	public void checkGetState() {
		Hole hole = new Hole(1);
		assertEquals(1, hole.getState());
	}

	@Test
	public void checkDefault() {
		assertEquals(1, Hole.getDefault().getState());
	}

}
