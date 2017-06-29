package peg_solitarie;


import java.util.ArrayList;

import peg_solitarie.Hole;

public class Board {
	private ArrayList<ArrayList> configuration = new ArrayList();
	Hole [][] board; 
	int numberPegs;
	
	public Board() {
		
		this.numberPegs = 0;
		this.board = new Hole[7][7];
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				this.board[i][j] = new Hole();
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
//			this.board[x][y].
			this.board[x][y].setState(2);
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
			String temp = con[i];
			lc.add(temp);
		}
		
		return lc;
		
	}
	
	private void basicFigure() {
		this.board[0][0].setState(0);
		this.board[0][1].setState(0);
		this.board[0][5].setState(0);
		this.board[0][6].setState(0);
		this.board[1][0].setState(0);
		this.board[1][1].setState(0);
		this.board[1][5].setState(0);
		this.board[1][6].setState(0);
		this.board[5][0].setState(0);
		this.board[5][1].setState(0);
		this.board[5][5].setState(0);
		this.board[5][6].setState(0);
		this.board[6][0].setState(0);
		this.board[6][1].setState(0);
		this.board[6][5].setState(0);
		this.board[6][6].setState(0);
	}
	
	public void printBoard() {
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				System.out.print(board[i][j].state );
			}
			System.out.println();
			System.out.println("                             ");
		}
//		System.out.println("          "+ "      ");
	}
	
}
