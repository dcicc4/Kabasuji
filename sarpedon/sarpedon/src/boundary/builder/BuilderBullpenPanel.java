package boundary.builder;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class BuilderBullpenPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public BuilderBullpenPanel() {
		setBorder(null);
		setBackground(Color.WHITE);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(1132)
					.addComponent(lblNewLabel_1))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(105)
					.addComponent(lblNewLabel_1))
		);
		setLayout(groupLayout);

	}

}
