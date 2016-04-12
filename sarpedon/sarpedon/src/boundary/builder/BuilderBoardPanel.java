package boundary.builder;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class BuilderBoardPanel extends JPanel {

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

}
