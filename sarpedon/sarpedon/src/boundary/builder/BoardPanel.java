package boundary.builder;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class BoardPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public BoardPanel() {
		setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		setBackground(Color.WHITE);
		setLayout(null);

	}

}
