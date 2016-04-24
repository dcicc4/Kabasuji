package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import entity.player.*;

import javax.swing.*;

import bounday.player.LightningLevelGui;
import bounday.player.PlayerBullpenPanel;
import bounday.player.PuzzleLevelGui;
import bounday.player.ReleaseLevelGui;

public class LevelNumberController implements ActionListener{


	Level level;
	String type;	
JFrame LG;

	public LevelNumberController( Level newlevel){
		
		level = newlevel;
		type = level.getType();
		if (type.equals("Puzzle"))
		{
			PuzzleLevelGui pLG = new PuzzleLevelGui((PuzzleLevel)level);
			LG = pLG;
			
		} else
		if (type.equals("Lightning"))
		{
			LG = new LightningLevelGui((LightningLevel)level);
		}else
		if (type.equals("Release"))
		{
			LG = new ReleaseLevelGui((ReleaseLevel)level);
			
			
			
		}else
		{
			System.out.println("Not Correct Name");
		}
		type = level.getType();
	}
	
	public JFrame getFrame(){
return LG;
	}
	public void changeLevelNumber(Integer number){
		level.setNumber(number);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
