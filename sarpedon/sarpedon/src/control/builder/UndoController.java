package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//import entity.player.*;
import entity.builder.*;

import javax.swing.*;

public class UndoController implements ActionListener{

	
	IBuilderModel aLevel;
	
	public UndoController(IBuilderModel aLevel){
		this.aLevel = aLevel;
	}
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		  IMove aMove = aLevel.getLastMove();
		  if(aMove ==null)
		  {return;}
		aMove.undo();
	}
}
