package peg_solitarie;

import java.util.ArrayList;

public class Board {
	private Hole[][] gameGrid;
	private ArrayList<String> configureBoard;
	
	public Board(String configuration) {
		gameGrid = new Hole[7][7]; 
		basicFigure();
		setBoardConfiguration(createConfiguration(configuration));
	}
	
	private void setBoardConfiguration(ArrayList<String> config) {
		setConfigureBoard(config);
		for(int i= 1; i< config.size(); i=i+2) {
			int x = Integer.parseInt( (String) config.get(i-1));
			int y = Integer.parseInt((String) config.get(i));
			gameGrid[x][y].setState(2);
		}
	}
	
	private ArrayList<String> createConfiguration(String initial) {
		ArrayList<String> lc = new ArrayList<String>();
		String[] con = initial.split(",");
		for(int i= 0; i< con.length; i++) {
			String temp = con[i];
			lc.add(temp);
		}
		return lc;
	}

	private void basicFigure() {
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				gameGrid[i][j] = Hole.getDefault();
			}
		}
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
			System.out.println();
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

	public ArrayList<String> getConfigureBoard(){
		return this.configureBoard;
	}

	public void setConfigureBoard(ArrayList<String> board){
		this.configureBoard = board;
	}
	
	public void resetBoard(){
		basicFigure();
		setBoardConfiguration(getConfigureBoard());
	}
}
