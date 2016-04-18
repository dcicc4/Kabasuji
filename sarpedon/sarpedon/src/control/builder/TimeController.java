package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import entity.player.*;

import javax.swing.*;

public class TimeController implements ActionListener{

	JTextField time;
	Level level;
	
	public TimeController(JTextField newtime, Level newlevel){
		time = newtime;
		level = newlevel;
	}
	
	public void changeTimeTo(int time){

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}