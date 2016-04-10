package bounday.player;

import java.awt.EventQueue;


public class PlayerApplication {

	PlayerSplashScreen splashScreen = new PlayerSplashScreen();
	KabasujiMenuGui menu = new KabasujiMenuGui();
	LevelSelectGui levelSelect = new LevelSelectGui();
	LightningLevelGui lightningLevel = new LightningLevelGui();
	ReleaseLevelGui releaseLevel = new ReleaseLevelGui();
	PuzzleLevelGui puzzleLevel = new PuzzleLevelGui();
	
	public PlayerApplication(){
		
	}
	
	public static void main(String[] args) {
		PlayerApplication app = new PlayerApplication();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					app.splashScreen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		try {
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		app.splashScreen.setVisible(false);
		app.splashScreen.dispose();
		app.menu.setVisible(true);
	}
}
