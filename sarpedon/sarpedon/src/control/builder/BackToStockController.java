package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import entity.player.*;
import boundary.builder.*;

//import javax.swing.*;

public class BackToStockController implements ActionListener{

	Board board;
	BuilderBoardPanel boardPanel;
	Piece piece;
	
	public BackToStockController(BuilderBoardPanel newboardPanel, Board newboard){
		boardPanel = newboardPanel;
		board = newboard;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
