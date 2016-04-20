package control.builder;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import entity.builder.BuilderModel;
import entity.player.Level;

public class SaveController extends MouseAdapter {

	String s;
	JButton aButt;
	Level aLevel;
	JTextField aText;
	public SaveController(JButton aButt, JTextField aText, BuilderModel model) {
		this.aText = aText;
		this.aButt = aButt;
		aLevel = model;
		
	}

	public void mousePressed(MouseEvent a) {
		{
			try {
				File aFile = new File (aText.getText()+".ext");
				
				FileOutputStream saveFile = new FileOutputStream(aFile);
				ObjectOutputStream save = new ObjectOutputStream(saveFile);
				save.writeObject(aLevel);
				save.close();
		System.exit(0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
