package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import entity.player.*;

import javax.swing.*;

public class LevelNumberController implements ActionListener{

	JFrame aFrame;
	Level level;
	String type;
	public LevelNumberController(JFrame frame, Level newlevel){
		this.aFrame= frame;
		level = newlevel;
		type = level.getType();
	}
	
	public void changeLevelNumber(Integer number){
		level.setNumber(number);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
