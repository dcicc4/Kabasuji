package control.player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ObjectInputStream;

import entity.player.Level;

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
	Level obj = (Level) restore.readObject();
	restore.close();
	return obj;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}
}
