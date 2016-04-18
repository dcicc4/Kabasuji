package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import entity.player.*;

import javax.swing.*;

public class BoardSizeController implements ActionListener{

	JPanel parentPanel;
	Board board;
	
	public BoardSizeController(JPanel panel, Board newboard){
		parentPanel = panel;
		board = newboard;
	}
	
	public void changeBoard(int size){

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}