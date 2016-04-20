package control.player;

import bounday.player.PuzzleLevelGui;

public class MovesLeftController {
	
	int moves;
	PuzzleLevelGui parentPanel;
	
	MovesLeftController(PuzzleLevelGui parentPanel, int moves) {
		this.moves = moves;
		this.parentPanel = parentPanel;
	}
}
