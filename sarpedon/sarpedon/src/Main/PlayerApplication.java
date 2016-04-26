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
	private KabasujiMenuGui menu = new KabasujiMenuGui();
	SarpedonKabasuji game = new SarpedonKabasuji();
	LevelSelectGui levelSelect = new LevelSelectGui(game, this);
	
	
	
	public PlayerApplication(){
		initializeControllers();
	}
	
	void initializeControllers() {
		//initialize controllers for main menu
		getMenu().getBtnLevelSelect().addActionListener(new SwitchWindowController(getMenu(), levelSelect));
		JButton[] buttons = levelSelect.getButtons();
		
		
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
		app.getMenu().setVisible(true);
	}

	public KabasujiMenuGui getMenu() {
		return menu;
	}

	public void setMenu(KabasujiMenuGui menu) {
		this.menu = menu;
	}
}
