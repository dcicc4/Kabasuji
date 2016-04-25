package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import javax.swing.JTextField;

import boundary.builder.LoadGui;
import bounday.player.LightningLevelGui;
import bounday.player.PuzzleLevelGui;
import bounday.player.ReleaseLevelGui;
import entity.player.LevelMomento;
import entity.player.LightningLevel;
import entity.player.PuzzleLevel;
import entity.player.ReleaseLevel;

public class LoadExistingToEditController implements ActionListener{
	JTextField fileNameText;
	LoadGui loadGui;
	
	public LoadExistingToEditController(JTextField t, LoadGui load){
		fileNameText = t;
		loadGui = load;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(fileNameText.getText() == null){fileNameText.setText("Please Enter a Valid Level Name");}
		try{		
			String fileName = fileNameText.getText();
			ObjectInputStream restore = new ObjectInputStream(new FileInputStream(fileName));
			LevelMomento obj = (LevelMomento) restore.readObject();
			restore.close();
		
			String type = obj.getType();
			
			if(type.equals("Puzzle")){
				PuzzleLevel model = new PuzzleLevel();
				model.restore(obj);
				PuzzleLevelGui gui = new PuzzleLevelGui(model);
				gui.setVisible(true);
				loadGui.setVisible(false);
			}
			if(type.equals("Lightning")){
				LightningLevel model = new LightningLevel();
				model.restore(obj);
				LightningLevelGui gui = new LightningLevelGui(model);
				gui.setVisible(true);
				loadGui.setVisible(false);
			}
			if(type.equals("Release")){
				ReleaseLevel model = new ReleaseLevel();
				model.restore(obj);
				ReleaseLevelGui gui = new ReleaseLevelGui(model);
				gui.setVisible(true);
				loadGui.setVisible(false);
			} else {
				fileNameText.setText("Type Not Recognized: Try Again");
			}
			
		} catch(Exception ex){
			fileNameText.setText("File Not Found; Try Again");
		}
	}
}
