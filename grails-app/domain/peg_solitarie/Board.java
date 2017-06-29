package peg_solitarie;


import java.util.ArrayList;

import peg_solitarie.Hole;

public class Board {
	private ArrayList<ArrayList> configuration = new ArrayList();
	Hole [][] board; 
	int numberPegs;
	
	public Board(int numberPegs) {
		
		this.numberPegs = numberPegs;
		this.board = new Hole[7][7];
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				this.board[i][j] = new Hole();
			}
		}
		basicFigure();
		addConfig();
	}
	
	public void boardMode( int mode ) {
		ArrayList config = configuration.get(mode);
		setConfiguration(config);
	
	}
	
	private void setConfiguration(ArrayList config) {
		for(int i= 1; i< config.size(); i=i+2) {
			int x = (int) config.get(i-1);
			int y =  (int) config.get(i);
			this.board[x][y].peg.active = true;
			this.board[x][y].state = 2;
		}
		
	}
	
	
	private void addConfig() {
		ArrayList  temp = latinCross();
		configuration.add(temp);
		
	}
	
	private ArrayList latinCross() {
		ArrayList lc = new ArrayList();
		String[] con = "1,3,2,2,2,3,2,4,3,3,4,3".split(",");
		for(int i= 0; i< con.length; i++) {
			int temp = Integer.parseInt(con[i]);
			lc.add(temp);
		}
		
		return lc;
		
	}
	
	private void basicFigure() {
		this.board[0][0].state = 0;
		this.board[0][1].state = 0;
		this.board[0][5].state = 0;
		this.board[0][6].state = 0;
		this.board[1][0].state = 0;
		this.board[1][1].state = 0;
		this.board[1][5].state = 0;
		this.board[1][6].state = 0;
		this.board[5][0].state = 0;
		this.board[5][1].state = 0;
		this.board[5][5].state = 0;
		this.board[5][6].state = 0;
		this.board[6][0].state = 0;
		this.board[6][1].state = 0;
		this.board[6][5].state = 0;
		this.board[6][6].state = 0;
	}
	
	public void printBoard() {
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				System.out.print(board[i][j].state);
			}
			System.out.println();
		}
	}
	
}
