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

	/**
	 * Constructor for decrementing the timer.
	 * Note this is executed by the swing timer.
	 * 
	 * @param l - level that you are setting the time in.
	 * @param time - Label that displays the time.
	 */
	public TimeController(LightningLevel l, JLabel time) {
		level = l;
		timeLeft = time;
	}

	@Override
	/**
	 * Decrements timer if the time hasn't already run out.
	 * Also won't decrement time if the level has been completed with three stars.
	 */
	public void actionPerformed(ActionEvent e) {
		if(level.getTimeLeft() > 0 && level.getStars() != 3){
			level.decrementTime();
			timeLeft.setText(level.getTimeLeft().toString());
		}
	}
}
