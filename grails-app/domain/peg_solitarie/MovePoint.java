package peg_solitarie;

import java.util.ArrayList;
import java.util.List;

public class MovePoint {
	  
	  private List<Integer> points;
	  
	  public MovePoint(int x1, int y1, int x2, int y2, int x3, int y3){
	    points = new ArrayList<>();
	    points.add(x1);
	    points.add(y1);
	    points.add(x2);
	    points.add(y2);
	    points.add(x3);
	    points.add(y3);
	  }
	  
	  public List<Integer> getPoints(){
	    return points;
	  }
	  
	  public void printPoint(){
	    List<String> letters = new ArrayList<>();
	    letters.add("a");
	    letters.add("b");
	    letters.add("c");
	    letters.add("d");
	    letters.add("e");
	    letters.add("f");
	    letters.add("g");
	    System.out.println("[" + letters.get(points.get(0)) + points.get(1) + " -> " + letters.get(points.get(2)) + points.get(3) + "]");
	  }
	}
