package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.JButton;

import entity.builder.BuilderModel;
import entity.player.Level;

public class SaveController extends MouseAdapter {

	String s;
	JButton aButt;
	Level aLevel;

	public SaveController(JButton aButt, String s, BuilderModel model) {
		this.s = s;
		this.aButt = aButt;
		aLevel = model;
	}

	public void mousePressed(MouseEvent a) {
		{
			try {
				FileOutputStream saveFile = new FileOutputStream(s);
				ObjectOutputStream save = new ObjectOutputStream(saveFile);
				save.writeObject(aLevel);
				save.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
