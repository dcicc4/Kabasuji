package control.player;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

import Main.PlayerApplication;
import bounday.player.EndLevelGui;
import entity.player.Level;
import entity.player.LightningLevel;
import entity.player.PuzzleLevel;
import entity.player.ReleaseLevel;
import entity.player.SarpedonKabasuji;

/**
 * This is the class that will return the player to the level select screen when they've finished a level.
 * In all games, the final move involves a piece placed on the board, so it will be a mouse listener attached to the board.
 * 
 * @author Nathan
 */
public class EndLevelController implements MouseListener{

	SarpedonKabasuji game;
	JFrame levelGui;
	Level level;
<<<<<<< HEAD
	PlayerApplication app;
	
	public EndLevelController(SarpedonKabasuji g, JFrame f,  Level l, PlayerApplication a){
=======
	PlayerApplication aPA;
	public EndLevelController(SarpedonKabasuji g, JFrame f,  Level l, PlayerApplication aPA){
>>>>>>> branch 'master' of https://nsdennler@fusion.wpi.edu/git/sarpedon/sarpedon.git
		game = g;
		levelGui = f;
		level = l;
<<<<<<< HEAD
		app = a;
=======
		this.aPA = aPA;
>>>>>>> branch 'master' of https://nsdennler@fusion.wpi.edu/git/sarpedon/sarpedon.git
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		return;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		return;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		String type = level.getType();
		boolean completed = false;
		if(type.equals("Puzzle")){
			completed = ((PuzzleLevel)level).getCompleted();
		}
		if(type.equals("Lightning")){
			completed = ((LightningLevel)level).getCompleted();
		}
		if(type.equals("Release")){
			completed = ((ReleaseLevel)level).getCompleted();
		}
		if(completed){
			if(level.getStars() > 0 && level.getNumber() == game.getCurrentLevel()){
				game.incrementLevel();
			}
<<<<<<< HEAD
			new EndLevelGui(game, levelGui, app).setVisible(true);
=======
			new EndLevelGui(game, levelGui, aPA).setVisible(true);
>>>>>>> branch 'master' of https://nsdennler@fusion.wpi.edu/git/sarpedon/sarpedon.git
		}
		else{
			return;
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		return;
	}

	@Override
	public void mouseExited(MouseEvent e) {
		return;
	}

}
