package control.player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import bounday.player.KabasujiMenuGui;
import entity.player.Level;
import entity.player.SarpedonKabasuji;

/**
 * Brings the user back to the main menu
 * @author Nathan
 *
 */
public class MenuController implements ActionListener{

	JFrame level;
	SarpedonKabasuji game;
	Level model;
	
	/**
	 * 
	 * @param l
	 * @param g
	 */
	public MenuController(JFrame l, SarpedonKabasuji g, Level m){
		level = l;
		game = g;
		model = m;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(model.getStars()> 0){
			game.setLevel(model);
			game.incrementLevel();
		}
		level.dispose();
		new KabasujiMenuGui(game).setVisible(true);
		
	}
}
