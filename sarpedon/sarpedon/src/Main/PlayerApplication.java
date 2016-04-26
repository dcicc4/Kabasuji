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
import entity.player.SarpedonKabasuji;


public class PlayerApplication {

	PlayerSplashScreen splashScreen = new PlayerSplashScreen();
	KabasujiMenuGui menu = new KabasujiMenuGui();
	SarpedonKabasuji game = new SarpedonKabasuji();
	LevelSelectGui levelSelect = new LevelSelectGui(game);
	
	
	
	public PlayerApplication(){
		initializeControllers();
	}
	
	void initializeControllers() {
		//initialize controllers for main menu
		menu.getBtnLevelSelect().addActionListener(new SwitchWindowController(menu, levelSelect));
		JButton[] buttons = levelSelect.getButtons();
		
		LevelNumberController LC = new LevelNumberController(game.getLevel(1), game);
		menu.getBtnNewGame().addActionListener(new SwitchWindowController(menu, LC.getFrame()));
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
