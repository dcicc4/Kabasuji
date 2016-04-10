package boundary.builder;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;

public class ReleaseBuilderGui extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReleaseBuilderGui frame = new ReleaseBuilderGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ReleaseBuilderGui() {
		setTitle("Kabasuji Release Level Builder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Possible Warning");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.RED);
		label.setBounds(25, 741, 251, 33);
		contentPane.add(label);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(25, 24, 279, 41);
		contentPane.add(btnSave);
		
		JButton button_1 = new JButton("Undo");
		button_1.setBounds(25, 80, 112, 41);
		contentPane.add(button_1);
		
		JRadioButton radioButton = new JRadioButton("Add Hint");
		buttonGroup.add(radioButton);
		radioButton.setBackground(Color.WHITE);
		radioButton.setBounds(81, 357, 251, 41);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Move Pieces");
		buttonGroup.add(radioButton_1);
		radioButton_1.setBackground(Color.WHITE);
		radioButton_1.setBounds(81, 418, 251, 41);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Move Tiles");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBackground(Color.WHITE);
		radioButton_2.setBounds(81, 479, 251, 41);
		contentPane.add(radioButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(767, 54, 600, 148);
		contentPane.add(scrollPane);
		
		BullpenPanel bullpenView = new BullpenPanel();
		scrollPane.setViewportView(bullpenView);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(454, 54, 303, 758);
		contentPane.add(scrollPane_1);
		
		JScrollBar stockScrollBar = new JScrollBar();
		scrollPane_1.setRowHeaderView(stockScrollBar);
		
		JLabel label_2 = new JLabel("Board Size");
		label_2.setBounds(35, 151, 138, 41);
		contentPane.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		comboBox.setSelectedIndex(13);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setBounds(245, 151, 53, 45);
		contentPane.add(comboBox);
		
		BoardPanel panel = new BoardPanel();
		panel.setBounds(767, 213, 600, 600);
		contentPane.add(panel);
		
		JRadioButton rdbtnNumberTile = new JRadioButton("Number Tile");
		buttonGroup.add(rdbtnNumberTile);
		rdbtnNumberTile.setBackground(Color.WHITE);
		rdbtnNumberTile.setBounds(81, 548, 109, 23);
		contentPane.add(rdbtnNumberTile);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Red", "Green", "Blue"}));
		comboBox_1.setSelectedIndex(1);
		comboBox_1.setBounds(155, 578, 64, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6"}));
		comboBox_2.setBounds(155, 609, 64, 20);
		contentPane.add(comboBox_2);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(108, 581, 37, 14);
		contentPane.add(lblColor);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setBounds(108, 612, 53, 14);
		contentPane.add(lblNumber);
		
		JLabel lblNewLabel = new JLabel("Level Number");
		lblNewLabel.setBounds(25, 247, 105, 14);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"}));
		comboBox_3.setBounds(245, 235, 53, 39);
		contentPane.add(comboBox_3);
		
		JButton button = new JButton("Rotate Clockwise");
		button.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button.setBackground(Color.LIGHT_GRAY);
		button.setBounds(454, 823, 125, 125);
		contentPane.add(button);
		
		JButton button_2 = new JButton("Rotate C. Clockwise");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_2.setBackground(Color.LIGHT_GRAY);
		button_2.setBounds(632, 823, 125, 125);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Flip Vertically");
		button_3.setBackground(Color.LIGHT_GRAY);
		button_3.setBounds(1107, 824, 125, 125);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("Flip Horizontally");
		button_4.setBackground(Color.LIGHT_GRAY);
		button_4.setBounds(1242, 824, 125, 125);
		contentPane.add(button_4);
	}
}
