package boundary.builder;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;

import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import entity.builder.BuilderModel;
import entity.player.Board;
import entity.player.Piece;
import entity.player.Square;
import entity.player.Tile;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class BuilderBoardPanel extends JPanel {

	/** Core model. */
	BuilderModel model;
	/** around edges. */
	int offset = 20;
	
	/** Size of a tile */
	public final int N = 46;  

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
	public BuilderBoardPanel(BuilderModel model) {
		this.model = model;
		
		setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 598, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 598, Short.MAX_VALUE)
		);
		setLayout(groupLayout);

	}
	public Graphics getOffscreenGraphics(){
		return offScreenGraphics;
	}
	@Override
	public Dimension getMinimumSize() {
		int width = 12*N + 2*offset;
		int height = 12*N + 2*offset;

		return new Dimension (width, height);
	}


	/** 
	 * Swing thing. We must be large enough to draw all Kabasuji pieces. 
	 */
	@Override
	public Dimension getPreferredSize() {
		int width = 16*N + 2*offset;
		int height = 16*N + 2*offset;
		
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
		if (model == null) { return; }

		// draw board.
		g.setColor(Color.white);
		g.fillRect(0,0,16*N,16*N);
		g.setColor(Color.black);
		//draws a 12 by 12 grid, because I hard coded a 12x12 grid
		Tile[][] tiles = model.getBoard().getTileArray();
		for(int i = 0; i<12; i++){
			for(int j = 0; j<12; j++){
				if(tiles[i][j] != null)
					g.drawRect(offset + i*N, offset + j*N, N, N);				
			}
		}
		Piece selected = model.getBullpen().getSelectedPiece();
		if (selected != null){
			if(mouse!= null){
				drawPiece(g, selected, mouse);
			}
			return;
		}
	}
	public void redraw() {

		Dimension dim = getPreferredSize();
		offScreenGraphics.clearRect(0, 0, dim.width, dim.height);

		//Board b = model.getBoard();
		offScreenGraphics.setColor(Color.WHITE);
		offScreenGraphics.fillRect(0, 0, 16*N, 16*N);
		offScreenGraphics.setColor(Color.black);
		Tile[][] tiles = model.getBoard().getTileArray();
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
	 * @param g - the graphics object being drawn to.
	 * @param p - the piece being drawn.
	 * @param i - the number piece it is.
	 */
	public void drawPiece(Graphics g, Piece p, Point point) {
		Square[] drawn = p.getDependant();
		for(int j = 0; j<5; j++){ 
			Square sq = drawn[j];
			g.setColor(p.getColor());
			g.fillRect(point.x+sq.getX()*N, point.y+sq.getY()*N, N, N);
			g.setColor(Color.black);
			g.drawRect(point.x+sq.getX()*N, point.y+sq.getY()*N, N, N);
		}
		g.setColor(p.getColor());
		g.fillRect(point.x, point.y, N, N);
		g.setColor(Color.black);
		g.drawRect(point.x, point.y, N, N);
	}
	
	

}

