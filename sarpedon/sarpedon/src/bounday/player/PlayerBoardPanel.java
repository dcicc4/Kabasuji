package bounday.player;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class PlayerBoardPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public PlayerBoardPanel() {
		setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		setBackground(Color.WHITE);
		setLayout(null);

	}

}
