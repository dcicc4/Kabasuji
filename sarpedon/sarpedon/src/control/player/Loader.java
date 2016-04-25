package control.player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ObjectInputStream;

import entity.player.Level;
import entity.player.LevelMomento;
import entity.player.LightningLevel;
import entity.player.PuzzleLevel;
import entity.player.ReleaseLevel;

public class Loader {
public Loader()
{
	
}
public Level getLevel (int x) 
{
	FileInputStream saveFile;
	try {
		saveFile = new FileInputStream("Level" + x +".ext");
	
	ObjectInputStream restore = new ObjectInputStream(saveFile);
	LevelMomento obj = (LevelMomento) restore.readObject();
	restore.close();
	Level level = null;
	String type = obj.getType();
	if(type.equals("Release")){
		ReleaseLevel rlevel = new ReleaseLevel();
		 rlevel.restore(obj);
		 return rlevel;
		
	}
	if(type.equals("Lightning")){
		LightningLevel llevel = new LightningLevel();
		 llevel.restore(obj);
		 return llevel;
	}
	if(type.equals("Puzzle")){
		PuzzleLevel plevel = new PuzzleLevel();
		 plevel.restore(obj);
		 return plevel;
	}
	return level;
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}
}
