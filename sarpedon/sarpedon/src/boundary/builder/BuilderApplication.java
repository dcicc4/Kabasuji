package boundary.builder;


import java.awt.EventQueue;

import javax.swing.*;

import control.builder.SwitchWindowController;
import entity.builder.BuildableLightning;
import entity.builder.BuildablePuzzle;
import entity.builder.BuildableRelease;
import entity.builder.IBuilderModel;

public class BuilderApplication{
	
	BuilderSplashScreen splashScreen = new BuilderSplashScreen();
	LevelBuilderGui levelBuilder = new LevelBuilderGui();
	
	LightningBuilderGui lightningBuilder = new LightningBuilderGui(new BuildableLightning());
	PuzzleBuilderGui puzzleBuilder = new PuzzleBuilderGui(new BuildablePuzzle());
	ReleaseBuilderGui releaseBuilder = new ReleaseBuilderGui(new BuildableRelease());
	LoadGui loadGui = new LoadGui();
	
	
	public BuilderApplication(){
		initializeControllers();
	}
	
	void initializeControllers(){
		//initialize controllers for each type of level builder 
		levelBuilder.btnLightningBuilder.addActionListener(new SwitchWindowController(levelBuilder, lightningBuilder));
		levelBuilder.btnPuzzleBuilder.addActionListener(new SwitchWindowController(levelBuilder, puzzleBuilder));
		levelBuilder.btnReleaseBuilder.addActionListener(new SwitchWindowController(levelBuilder, releaseBuilder));
		levelBuilder.btnEditExisting.addActionListener(new SwitchWindowController(levelBuilder, loadGui));
	}
	
	public static void main(String[] args) {	
		final BuilderApplication app = new BuilderApplication();
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
		//switch to main screen
		app.splashScreen.setVisible(false);
		app.splashScreen.dispose();
		app.levelBuilder.setVisible(true);
	}
}
