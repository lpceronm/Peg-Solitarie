package peg_solitarie;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class MovePointTest {

	@Test
	public void testConstructor() {
		MovePoint movePoint = new MovePoint(1,2,3,4,5,6);
		List<Integer> points = movePoint.getPoints();
		int x1 = points.get(0);
		int y1 = points.get(1);
		int x2 = points.get(2);
		int y2 = points.get(3);
		int x3 = points.get(4);
		int y3 = points.get(5);
		assertEquals(1, x1);
		assertEquals(1, y1);
		assertEquals(1, x2);
		assertEquals(1, y2);
		assertEquals(1, x3);
		assertEquals(1, y3);
	}

}
