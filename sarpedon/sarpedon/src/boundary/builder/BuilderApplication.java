package boundary.builder;

import java.awt.EventQueue;

import javax.swing.*;

public class BuilderApplication{

	BuilderSplashScreen splashScreen = new BuilderSplashScreen();
	LevelBuilderGui levelBuilder = new LevelBuilderGui();
	LightningBuilderGui lightningBuilder = new LightningBuilderGui();
	PuzzleBuilderGui puzzleBuilder = new PuzzleBuilderGui();
	ReleaseBuilderGui releaseBuilder = new ReleaseBuilderGui();
	
	public BuilderApplication(){
	}
	
	public static void main(String[] args) {
		BuilderApplication app = new BuilderApplication();
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		app.splashScreen.setVisible(false);
		app.splashScreen.dispose();
		app.levelBuilder.setVisible(true);
	}
}
