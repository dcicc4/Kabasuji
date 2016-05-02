package control.player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bounday.player.LevelSelectGui;
import entity.player.Level;
import entity.player.SarpedonKabasuji;

public class NewGameController implements ActionListener{

	SarpedonKabasuji game;
	
	public NewGameController(SarpedonKabasuji g){
		game = g;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(Level l: game.getLevels()){
			if(l!=null){
			l.setStars(0);
			}
		}
		game.resetCurrentLevel();
		new LevelSelectGui(game).setVisible(true);	
	}

}
