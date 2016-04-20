package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import entity.player.*;

import javax.swing.*;

public class LevelNumberController implements ActionListener{


	Level level;
	String type;	
JFrame LG;

	public LevelNumberController( Level newlevel){
		
		level = newlevel;
		type = level.getType();
		if (type.equals("Puzzle"))
		{
			PuzzleLevelGui pLG = new PuzzleLevelGui();
			PlayerBullpenPanel aPanel = new PlayerBullpenPanel(level.getBullpen());
			pLG.setBullpen(aPanel);
			LG = pLG;
			
		} else
		if (type.equals("Lightning"))
		{
			LG = new LightningLevelGui();
		}else
		if (type.equals("Release"))
		{
			LG = new ReleaseLevelGui();
			
			
			
		}else
		{
			System.out.println("Not Correct Name");
		}
		type = level.getType();
	}
	
	public JFrame getFrame(){
return LG;
	public void changeLevelNumber(Integer number){
		level.setNumber(number);
	public void changeLevelNumber(Integer number){
		level.setNumber(number);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
