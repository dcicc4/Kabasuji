package Main;

import java.awt.EventQueue;

import javax.swing.JButton;

import bounday.player.KabasujiMenuGui;
import bounday.player.LevelSelectGui;
import bounday.player.PlayerSplashScreen;
import control.builder.LevelNumberController;
import control.player.Loader;
import control.player.SwitchWindowController;
import entity.player.Level;


public class PlayerApplication {

	PlayerSplashScreen splashScreen = new PlayerSplashScreen();
	KabasujiMenuGui menu = new KabasujiMenuGui();
	LevelSelectGui levelSelect = new LevelSelectGui();
	int levelNumber;
	
	
	
	public PlayerApplication(){
		initializeControllers();
	}
	
	void initializeControllers() {
		//initialize controllers for main menu
		menu.getBtnLevelSelect().addActionListener(new SwitchWindowController(menu, levelSelect));
		
		
		
		//initialize controllers for the individual levels on level select screen (may want to replace with LoadLevelController or something
		levelNumber = 1;
		JButton[] buttons = levelSelect.getButtons();
		Loader l = new Loader();
		Level currentLevel = l.getLevel(levelNumber);
		
		LevelNumberController LC = new LevelNumberController(currentLevel);
		buttons[0].addActionListener(new SwitchWindowController(levelSelect, LC.getFrame()));
		menu.getBtnNewGame().addActionListener(new SwitchWindowController(menu, LC.getFrame()));
		levelNumber++;
		
		/*
		currentLevel = l.getLevel(levelNumber);
		LevelNumberController LC2 = new LevelNumberController(currentLevel);
		levelSelect.btnLevel2.addActionListener(new SwitchWindowController(levelSelect, LC2.getFrame()));
		levelNumber++;
	
		currentLevel = l.getLevel(levelNumber);
		LevelNumberController LC3 = new LevelNumberController(currentLevel);
		levelSelect.btnLevel3.addActionListener(new SwitchWindowController(levelSelect, LC3.getFrame()));
		levelNumber++;
		
		currentLevel = l.getLevel(levelNumber);
		LevelNumberController LC4 = new LevelNumberController(currentLevel);
		levelSelect.btnLevel4.addActionListener(new SwitchWindowController(levelSelect, LC4.getFrame()));
		levelNumber++;
		
		currentLevel = l.getLevel(levelNumber);
		LevelNumberController LC5 = new LevelNumberController(currentLevel);
		levelSelect.btnLevel5.addActionListener(new SwitchWindowController(levelSelect, LC5.getFrame()));
		levelNumber++;
		
		currentLevel = l.getLevel(levelNumber);
		LevelNumberController LC6 = new LevelNumberController(currentLevel);
		levelSelect.btnLevel6.addActionListener(new SwitchWindowController(levelSelect, LC6.getFrame()));
		levelNumber++;
		
		currentLevel = l.getLevel(levelNumber);
		LevelNumberController LC7 = new LevelNumberController(currentLevel);
		levelSelect.btnLevel7.addActionListener(new SwitchWindowController(levelSelect, LC7.getFrame()));
		levelNumber++;
		
		currentLevel = l.getLevel(levelNumber);
		LevelNumberController LC8 = new LevelNumberController(currentLevel);
		levelSelect.btnLevel8.addActionListener(new SwitchWindowController(levelSelect, LC8.getFrame()));
		levelNumber++;
		
		currentLevel = l.getLevel(levelNumber);
		LevelNumberController LC9 = new LevelNumberController(currentLevel);
		levelSelect.btnLevel9.addActionListener(new SwitchWindowController(levelSelect, LC9.getFrame()));
		levelNumber++;
		
		currentLevel = l.getLevel(levelNumber);
		LevelNumberController LC10 = new LevelNumberController(currentLevel);
		levelSelect.btnLevel10.addActionListener(new SwitchWindowController(levelSelect, LC10.getFrame()));
		levelNumber++;
		
		currentLevel = l.getLevel(levelNumber);
		LevelNumberController LC11 = new LevelNumberController(currentLevel);
		levelSelect.btnLevel11.addActionListener(new SwitchWindowController(levelSelect, LC11.getFrame()));
		levelNumber++;
		
		currentLevel = l.getLevel(levelNumber);
		LevelNumberController LC12 = new LevelNumberController(currentLevel);
		levelSelect.btnLevel12.addActionListener(new SwitchWindowController(levelSelect, LC12.getFrame()));
		levelNumber++;
		
		currentLevel = l.getLevel(levelNumber);
		LevelNumberController LC13 = new LevelNumberController(currentLevel);
		levelSelect.btnLevel13.addActionListener(new SwitchWindowController(levelSelect, LC13.getFrame()));
		levelNumber++;
		
		currentLevel = l.getLevel(levelNumber);
		LevelNumberController LC14 = new LevelNumberController(currentLevel);
		levelSelect.btnLevel14.addActionListener(new SwitchWindowController(levelSelect, LC14.getFrame()));
		levelNumber++;
		
		currentLevel = l.getLevel(levelNumber);
		LevelNumberController LC15 = new LevelNumberController(currentLevel);
		levelSelect.btnLevel15.addActionListener(new SwitchWindowController(levelSelect, LC15.getFrame()));
		levelNumber++;
		//initialize return to menu buttons in the Level Guis
		*/
	}

	public static void main(String[] args) {
		final PlayerApplication app = new PlayerApplication();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//show splash screen window
					app.splashScreen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		try {
			//wait three seconds
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//show main menu
		app.splashScreen.setVisible(false);
		app.splashScreen.dispose();
		app.menu.setVisible(true);
	}
}
