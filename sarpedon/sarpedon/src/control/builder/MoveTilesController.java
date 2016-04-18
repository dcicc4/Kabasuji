package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import entity.player.*;

import javax.swing.*;

public class MoveTilesController implements ActionListener{

	JPanel boardPanel;
	Tile tile;
	Board board;
	
	public MoveTilesController(JPanel newboardPanel, Board newboard){
		boardPanel = newboardPanel;
		board = newboard;
	}
	
	public void move(int x, int y, Tile tile){

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}