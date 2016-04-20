package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//import entity.player.*;
import entity.builder.*;

import javax.swing.*;

public class UndoController implements ActionListener{

	ArrayList<Move> moves;
	JPanel parentPanel;
	
	public UndoController(JPanel panel){
		parentPanel = panel;
	}
	
	public void addMove(Move move){

	}
	
	public void undoMove(){

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}