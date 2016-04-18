package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import entity.player.*;
import boundary.builder.*;

//import javax.swing.*;

public class BoardToBullpenController implements ActionListener{

	Board board;
	Bullpen bullpen;
	BuilderBoardPanel boardPanel;
	BuilderBullpenPanel bullpenPanel;
	Piece piece;
	
	public BoardToBullpenController(Board newboard, Bullpen newbullpen, BuilderBoardPanel newboardPanel,BuilderBullpenPanel newbullpenPanel){
		board = newboard;
		bullpen = newbullpen;
		boardPanel = newboardPanel;
		bullpenPanel = newbullpenPanel;
	}
	
	public void move(Piece piece, int col, int row){

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}