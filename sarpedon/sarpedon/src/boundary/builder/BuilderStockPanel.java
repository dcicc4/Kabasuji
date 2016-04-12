package boundary.builder;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class BuilderStockPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public BuilderStockPanel() {
		setBounds(0,0,225,1053);
		setBorder(null);
		setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 301, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1051, Short.MAX_VALUE)
		);
		setLayout(groupLayout);

	}

}
