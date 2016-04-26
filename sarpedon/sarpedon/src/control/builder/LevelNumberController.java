package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import entity.player.*;

import javax.swing.*;

import bounday.player.LightningLevelGui;
import bounday.player.PlayerBullpenPanel;
import bounday.player.PuzzleLevelGui;
import bounday.player.ReleaseLevelGui;

public class LevelNumberController {


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
		{		LightningLevelGui lLG = new LightningLevelGui((LightningLevel)level);
			LG = lLG;			
		}else
		if (type.equals("Release"))
		{	ReleaseLevelGui rLG = new ReleaseLevelGui((ReleaseLevel)level);
			LG = rLG;
			
			
			
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


}
