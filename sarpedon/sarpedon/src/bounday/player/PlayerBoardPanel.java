package bounday.player;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Polygon;

import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import entity.player.*;

public class PlayerBoardPanel extends JPanel {

	/** Core model. */
	Level aLevel;
	
	/** around edges. */
	int offset = 32;
	
	/** Base size of puzzle. */
	public final int N = 60;   // size of the edge of one tile
	
	/** Off-screen image for drawing (and Graphics object). */
	Image offScreenImage = null;
	Graphics offScreenGraphics = null;
	
	Point mouse = null;
	
	
	public int getN(){
		return N;
	}
	public void setMouse(Point p){
		mouse = p;
	}
	
	/**
	 * Create the panel.
	 */
	public PlayerBoardPanel() {
		//add Model to constructor parameters and have it set it here
		setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		setBackground(Color.WHITE);

	}
	
	@Override
	public Dimension getMinimumSize() {
		int width = 2*N + 2*offset;
		int height = 2*N + 2*offset;

		return new Dimension (width, height);
	}


	/** 
	 * Swing thing. We must be large enough to draw all Kabasuji pieces. 
	 */
	@Override
	public Dimension getPreferredSize() {
		int width = 12*N + 2*offset;
		int height = 12*N + 2*offset;
		
		return new Dimension (width, height);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		if (offScreenImage == null) {
			// create on demand
			Dimension s = getPreferredSize();
			offScreenImage = this.createImage(s.width, s.height);
			offScreenGraphics = offScreenImage.getGraphics();

			redraw();
		}

		// if no offscreenImage, then Swing hasn't fully initialized; leave now
		if (offScreenImage == null) {
			System.err.println("Swing not ready for drawing.");
			return;
		}

		// copy image into place.
		g.drawImage(offScreenImage, 0, 0, this);

		//double check if no model (for WindowBuilder)
		if (aLevel == null) { return; }

		// draw board.
		g.setColor(new Color(240, 240, 240));
		g.fillRect(0,0,16*N,16*N);
		//draws a 12 by 12 grid, because I hard coded a 12x12 grid
		Tile[][] tiles = aLevel.getBoard().getTileArray();
		for(int i = 0; i<12; i++){
			for(int j = 0; j<12; j++){
				Tile tile = tiles[i][j];
				if(tile != null){
					g.setColor(Color.white);
					g.fillRect(offset + i*N, offset + j*N, N, N);
					if(aLevel.getBoard().getPiece(i, j)!= null){
						g.setColor(aLevel.getBoard().getPiece(i, j).getColor());
						g.fillRect(offset + i*N, offset + j*N, N, N);
					}
					g.setColor(Color.black);
					g.drawRect(offset + i*N, offset + j*N, N, N);
				}
			}
		}
		//draw the selected piece at the mouse tip
		Piece selected = aLevel.getBullpen().getSelectedPiece();
		if (selected != null){
			if(mouse!= null){
				drawPiece(g, selected, mouse);
			}
			if(mouse == null){
				drawPiece(g, selected, new Point(offset + N*6, offset + N*6));
			}

		}
		//draw a moving tile at the tip of the mouse
		if(aLevel.getBoard().getMovingTile() && mouse != null){
			g.setColor(Color.white);
			g.fillRect(mouse.x-N/2, mouse.y-N/2, N, N);
			g.setColor(Color.BLACK);
			g.drawRect(mouse.x-N/2, mouse.y-N/2, N, N);
		}
	}
	public void redraw() {

		Dimension dim = getPreferredSize();
		offScreenGraphics.clearRect(0, 0, dim.width, dim.height);

		//Board b = aLevel.getBoard();
		offScreenGraphics.setColor(Color.WHITE);
		offScreenGraphics.fillRect(0, 0, 16*N, 16*N);
		offScreenGraphics.setColor(Color.black);
		Tile[][] tiles = aLevel.getBoard().getTileArray();
		for(int i = 0; i<12; i++){
			for(int j = 0; j<12; j++){
				if(tiles[i][j] != null)
					offScreenGraphics.drawRect(offset + i*N, offset + j*N, N, N);				
			}
		}
	}
	
	/**
	 * Helper method to draw a piece.
	 * 
	 * This belongs in the boundary class because it is the one drawing the pixels.
	 * 
	 * @param g - the graphics object being drawn to.
	 * @param p - the piece being drawn.
	 * @param i - the number piece it is.
	 */
	public void drawPiece(Graphics g, Piece p, Point point) {
		Square[] drawn = p.getDependant();
		for(int j = 0; j<6; j++){ 
			Square sq = drawn[j];
			g.setColor(p.getColor());
			g.fillRect(point.x+sq.getX()*N, point.y+sq.getY()*N, N, N);
			g.setColor(Color.black);
			g.drawRect(point.x+sq.getX()*N, point.y+sq.getY()*N, N, N);
		}
	}

}
