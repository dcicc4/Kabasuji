package bounday.player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import entity.player.SarpedonKabasuji;

/**
 * Brings the user back to the main menu
 * @author Nathan
 *
 */
public class MenuController implements ActionListener{

	JFrame level;
	SarpedonKabasuji game;
	
	public MenuController(JFrame l, SarpedonKabasuji g){
		level = l;
		game = g;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		level.dispose();
		new KabasujiMenuGui(game).setVisible(true);
		
	}
}
