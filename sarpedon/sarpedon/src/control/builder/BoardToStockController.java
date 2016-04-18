package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import entity.player.*;
import boundary.builder.*;

//import javax.swing.*;

public class BoardToStockController implements ActionListener{

	Board board;
	BuilderBoardPanel boardPanel;
	Piece piece;
	
	public BoardToStockController(BuilderBoardPanel newboardPanel, Board newboard){
		boardPanel = newboardPanel;
		board = newboard;
	}
	
	public void move(Piece piece, int col, int row){

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
