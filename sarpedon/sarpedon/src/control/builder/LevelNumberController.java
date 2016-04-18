package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import entity.player.*;

import javax.swing.*;

public class LevelNumberController implements ActionListener{

	JPanel parentPanel;
	Level level;
	
	public LevelNumberController(JPanel panel, Level newlevel){
		parentPanel = panel;
		level = newlevel;
	}
	
	public void changeLevelNumber(int number){

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
