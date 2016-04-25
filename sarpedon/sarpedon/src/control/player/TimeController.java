package control.player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import entity.player.LightningLevel;
/**
 * Decrements the time by one.
 * This will be executed by the timer every second.
 * 
 * @author Nathan
 *
 */
public class TimeController implements ActionListener {

	LightningLevel level;
	JLabel timeLeft;

	public TimeController(LightningLevel l, JLabel time) {
		level = l;
		timeLeft = time;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(level.getTimeLeft() > 0 && level.getStars() != 3){
			level.decrementTime();
			timeLeft.setText(level.getTimeLeft().toString());
		}
	}
}
