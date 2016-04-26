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
	PlayerApplication app;
	
	public EndLevelController(SarpedonKabasuji g, JFrame f,  Level l, PlayerApplication a){
		game = g;
		levelGui = f;
		level = l;
		app = a;

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
			int currStars = level.getStars();
			int prevStars = game.getLevel(level.getNumber()).getStars();
			if(currStars >= prevStars){
				game.getLevel(level.getNumber()).setStars(currStars);
			}
			new EndLevelGui(game, levelGui, app).setVisible(true);
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
