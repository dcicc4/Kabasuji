package boundary.builder;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class BuilderBullpenPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public BuilderBullpenPanel() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(51, 105, 46, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(1132, 105, 46, 14);
		add(lblNewLabel_1);

	}

}
