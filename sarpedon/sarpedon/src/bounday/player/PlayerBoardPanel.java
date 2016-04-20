package bounday.player;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Polygon;

import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import entity.player.*;

public class PlayerBoardPanel extends JPanel {

	/** Core model. */
	SarpedonKabasuji model;
	
	/** around edges. */
	int offset = 32;
	
	/** Base size of puzzle. */
	public final int N = 60;   // size of the edge of one tile
	
	/** Off-screen image for drawing (and Graphics object). */
	Image offScreenImage = null;
	Graphics offScreenGraphics = null;
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
	 * Swing thing. We must be large enough to draw all Tangram pieces. 
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
		if (model == null) { return; }
		
		// draw active polygon.
			g.setColor(Color.white);
			g.fillRect(0,0,12*N,12*N);
			g.setColor(Color.black);
			//draws a 12 by 12 grid, but it will take in the models board object eventually
			for(int i = 0; i<12; i++){
				for(int j = 0; j<12; j++){
					g.drawRect(i*N, j*N, N, N);
				}
			}
			
	}
	public void redraw() {
		// Once created, draw each, with buffer.
		int x = offset;
		int y = offset;
		
		Dimension dim = getPreferredSize();
		offScreenGraphics.clearRect(0, 0, dim.width, dim.height);
		
		//Board b = model.getBoard();
		offScreenGraphics.setColor(Color.WHITE);
		offScreenGraphics.fillRect(0, 0, 12*N, 12*N);
		offScreenGraphics.setColor(Color.black);
		for(int i = 0; i<12; i++){
			for(int j = 0; j<12; j++){
				offScreenGraphics.drawRect(i*N, j*N, N, N);
			}
		}
		
		// placed pieces.
		/*if (model.getPlacedPieces() != null) {
			for (PlacedPiece pp : model.getPlacedPieces()) {
				if (pp != model.getDraggingPiece()) {
					offScreenGraphics.setColor(colorMapping.get(pp.getPiece()));
					offScreenGraphics.fillPolygon(pp.getPolygon());
				}
			}
		}*/		
	}

}
