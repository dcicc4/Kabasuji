package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import entity.player.*;

import javax.swing.*;

public class NumberTileController implements ActionListener{

	JComboBox selection;
	Level level;
	
	public NumberTileController(JComboBox newselection, Level newlevel){
		selection = newselection;
		level = newlevel;
	}
	
	public void add(Tile tile,int color, int number){

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}