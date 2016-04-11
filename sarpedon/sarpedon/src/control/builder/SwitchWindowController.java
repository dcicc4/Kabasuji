package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwitchWindowController implements ActionListener{

	JFrame currentFrame;
	JFrame nextFrame;
	
	public SwitchWindowController(JFrame current, JFrame next){
		currentFrame = current;
		nextFrame = next;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		nextFrame.setVisible(true);	
		currentFrame.setVisible(false);
		
	}
}
