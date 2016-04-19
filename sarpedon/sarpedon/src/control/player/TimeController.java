package control.player;

import bounday.player.LightningLevelGui;

public class TimeController {
	LightningLevelGui parentPanel;
	int time;
	
	TimeController(LightningLevelGui parentPanel, int time) {
		this.parentPanel = parentPanel;
		this.time = time;
	}
}
