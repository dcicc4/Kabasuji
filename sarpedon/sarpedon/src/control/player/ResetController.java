package control.player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bounday.player.PlayerBoardPanel;

public class ResetController implements ActionListener{
	PlayerBoardPanel parentPanel;
	
	ResetController(PlayerBoardPanel parentPanel) {
		this.parentPanel = parentPanel;
	}
	
	void reset() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
