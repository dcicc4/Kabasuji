package control.player;

import bounday.player.LevelSelectGui;
import entity.player.Level;

public class LevelSelectController {
	
	LevelSelectGui parentPanel;
	Level level;
	
	LevelSelectController(LevelSelectGui parentPanel, Level level) {
		this.parentPanel = parentPanel;
		this.level = level;
	}
	
	void start (Level level) {
		
	}
}
