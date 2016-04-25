package control.player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Switches frames for navigation of the application.
 * 
 * @author Nathan
 *
 */
public class SwitchWindowController implements ActionListener{

	JFrame currentFrame;
	JFrame nextFrame;
	
	/**
	 * Constructor for the switching of windows in Kabasuji Application.
	 * 
	 * @param current - current frame
	 * @param next - frame to switch to
	 */
	public SwitchWindowController(JFrame current, JFrame next){
		currentFrame = current;
		nextFrame = next;
	}
	
	@Override
	/**
	 * set the current frame to be not visible, and the next frame to be visible.
	 */
	public void actionPerformed(ActionEvent e) {
		nextFrame.setVisible(true);	
		currentFrame.setVisible(false);
	}
}
