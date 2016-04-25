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
		level = new ReleaseLevel();
		level.restore(obj);
	}
	if(type.equals("Lightning")){
		level = new LightningLevel();
		level.restore(obj);
	}
	if(type.equals("Puzzle")){
		level = new PuzzleLevel();
		level.restore(obj);
	}
	return level;
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}
}
