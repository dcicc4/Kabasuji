package boundary.builder;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import entity.player.Model;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class BuilderBoardPanel extends JPanel {

	/** Core model. */
	Model model; //this is currently the player model, change it when we have builder model(check imports)
	
	/** around edges. */
	int offset = 20;
	
	/** Base size of puzzle. */
	public final int N = 46;   // size of the edge of one tile
	
	/** Off-screen image for drawing (and Graphics object). */
	Image offScreenImage = null;
	Graphics offScreenGraphics = null;
	
	/**
	 * Create the panel.
	 */
	public BuilderBoardPanel() {
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
	@Override
	public Dimension getMinimumSize() {
		int width = 12*N + 2*offset;
		int height = 12*N + 2*offset;

		return new Dimension (width, height);
	}


	/** 
	 * Swing thing. We must be large enough to draw all Tangram pieces. 
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
		
		// draw active polygon.
			g.setColor(Color.white);
			g.fillRect(0,0,16*N,16*N);
			g.setColor(Color.black);
			//draws a 12 by 12 grid, but it will take in the models board object eventually
			for(int i = 0; i<12; i++){
				for(int j = 0; j<12; j++){
					g.drawRect(offset + i*N, offset + j*N, N, N);
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
		offScreenGraphics.fillRect(0, 0, 16*N, 16*N);
		offScreenGraphics.setColor(Color.black);
		for(int i = 0; i<12; i++){
			for(int j = 0; j<12; j++){
				offScreenGraphics.drawRect(offset + i*N, offset + j*N, N, N);
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
