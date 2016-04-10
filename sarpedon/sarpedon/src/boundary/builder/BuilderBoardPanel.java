package boundary.builder;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class BuilderBoardPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public BuilderBoardPanel() {
		setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		setBackground(Color.WHITE);
		setLayout(null);

	}

}
