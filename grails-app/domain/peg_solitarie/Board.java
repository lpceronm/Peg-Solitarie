package peg_solitarie;


import java.util.ArrayList;

public class Board {
	private ArrayList<ArrayList> configuration = new ArrayList();
	private Hole[][] gameGrid;

	public Board() {
		gameGrid = new Hole[7][7];
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				gameGrid[i][j] = Hole.getDefault();
			}
		}
		basicFigure();
		addConfig();
        boardMode(0);
	}

	public void boardMode( int mode ) {
		ArrayList config = configuration.get(mode);
		setConfiguration(config);
	}

	private void setConfiguration(ArrayList config) {
		for(int i= 1; i< config.size(); i=i+2) {
			int x = Integer.parseInt( (String) config.get(i-1));
			int y = Integer.parseInt((String) config.get(i));
			gameGrid[x][y].setState(2);
		}
	}


	private void addConfig() {
		configuration.add(latinCross());
	}

	private ArrayList latinCross() {
		ArrayList lc = new ArrayList();
		String[] con = "1,3,2,2,2,3,2,4,3,3,4,3".split(",");
		for(int i= 0; i< con.length; i++) {
			String temp = con[i];
			lc.add(temp);
		}
		return lc;
	}
	
	private void basicFigure() {
		gameGrid[0][0].setState(0);
		gameGrid[0][1].setState(0);
		gameGrid[0][5].setState(0);
		gameGrid[0][6].setState(0);
		gameGrid[1][0].setState(0);
		gameGrid[1][1].setState(0);
		gameGrid[1][5].setState(0);
		gameGrid[1][6].setState(0);
		gameGrid[5][0].setState(0);
		gameGrid[5][1].setState(0);
		gameGrid[5][5].setState(0);
		gameGrid[5][6].setState(0);
		gameGrid[6][0].setState(0);
		gameGrid[6][1].setState(0);
		gameGrid[6][5].setState(0);
		gameGrid[6][6].setState(0);
	}

	public void printBoard() {
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				System.out.print(gameGrid[i][j].getState());
			}
		}
		
	}

	public int evaluateBoard(){
		int score = 0;
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				if (gameGrid[i][j].getState() == 2){
					score++;
				}
			}
		}
		return score;
	}

	public boolean conditionWin(){
		int score = evaluateBoard();
		return (score == 1) ? true : false;
	}

	public void setOwnerHole(int x, int y, int state){
		gameGrid[y][x].setState(state);
	}

	public int getOwnerHole(int x, int y){
		return gameGrid[x][y].getState();
	}

}
