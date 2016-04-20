package bounday.player;

import java.awt.EventQueue;

import control.player.Loader;
import control.player.SwitchWindowController;
import entity.player.Level;


public class PlayerApplication {

	PlayerSplashScreen splashScreen = new PlayerSplashScreen();
	KabasujiMenuGui menu = new KabasujiMenuGui();
	LevelSelectGui levelSelect = new LevelSelectGui();

	LightningLevelGui lightningLevel  = new LightningLevelGui();
	ReleaseLevelGui releaseLevel = new ReleaseLevelGui();
	PuzzleLevelGui puzzleLevel = new PuzzleLevelGui();
	
	
	public PlayerApplication(){
		initializeControllers();
		int levelNumber = 0;
		Loader l = new Loader();
		Level currentLevel = l.getLevel(levelNumber);
	}
	
	void initializeControllers() {
		//initialize controllers for main menu
		menu.btnLevelSelect.addActionListener(new SwitchWindowController(menu, levelSelect));
		menu.btnNewGame.addActionListener(new SwitchWindowController(menu, puzzleLevel));
		//initialize controllers for the individual levels on level select screen (may want to replace with LoadLevelController or something
		levelSelect.btnLevel1.addActionListener(new SwitchWindowController(levelSelect, puzzleLevel));
		levelSelect.btnLevel2.addActionListener(new SwitchWindowController(levelSelect, lightningLevel));
		levelSelect.btnLevel3.addActionListener(new SwitchWindowController(levelSelect, releaseLevel));
		levelSelect.btnLevel4.addActionListener(new SwitchWindowController(levelSelect, puzzleLevel));
		levelSelect.btnLevel5.addActionListener(new SwitchWindowController(levelSelect, lightningLevel));
		levelSelect.btnLevel6.addActionListener(new SwitchWindowController(levelSelect, releaseLevel));
		levelSelect.btnLevel7.addActionListener(new SwitchWindowController(levelSelect, puzzleLevel));
		levelSelect.btnLevel8.addActionListener(new SwitchWindowController(levelSelect, lightningLevel));
		levelSelect.btnLevel9.addActionListener(new SwitchWindowController(levelSelect, releaseLevel));
		levelSelect.btnLevel10.addActionListener(new SwitchWindowController(levelSelect, puzzleLevel));
		levelSelect.btnLevel11.addActionListener(new SwitchWindowController(levelSelect, lightningLevel));
		levelSelect.btnLevel12.addActionListener(new SwitchWindowController(levelSelect, releaseLevel));
		levelSelect.btnLevel13.addActionListener(new SwitchWindowController(levelSelect, puzzleLevel));
		levelSelect.btnLevel14.addActionListener(new SwitchWindowController(levelSelect, lightningLevel));
		levelSelect.btnLevel15.addActionListener(new SwitchWindowController(levelSelect, releaseLevel));
		//initialize return to menu buttons in the Level Guis
		lightningLevel.btnReturn.addActionListener(new SwitchWindowController(lightningLevel, menu));
		releaseLevel.btnReturn.addActionListener(new SwitchWindowController(releaseLevel, menu));
		puzzleLevel.btnReturn.addActionListener(new SwitchWindowController(puzzleLevel, menu));
		
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
