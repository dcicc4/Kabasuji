package boundary;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;

public class LightningBuilderGui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LightningBuilderGui frame = new LightningBuilderGui();
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
	public LightningBuilderGui() {
		setTitle("Kabasuji Lightning Level Builder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(178, 674, 105, 39);
		contentPane.add(textField);
		
		JLabel label = new JLabel("Possible Warning");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.RED);
		label.setBounds(10, 728, 251, 33);
		contentPane.add(label);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(10, 11, 279, 41);
		contentPane.add(btnSave);
		
		JButton button_1 = new JButton("Undo");
		button_1.setBounds(10, 67, 112, 41);
		contentPane.add(button_1);
		
		JRadioButton radioButton = new JRadioButton("Add Hint");
		buttonGroup.add(radioButton);
		radioButton.setBackground(Color.WHITE);
		radioButton.setBounds(66, 344, 251, 41);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Move Pieces");
		buttonGroup.add(radioButton_1);
		radioButton_1.setBackground(Color.WHITE);
		radioButton_1.setBounds(66, 405, 251, 41);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Move Tiles");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBackground(Color.WHITE);
		radioButton_2.setBounds(66, 466, 251, 41);
		contentPane.add(radioButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(752, 63, 600, 148);
		contentPane.add(scrollPane);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setOrientation(JScrollBar.HORIZONTAL);
		scrollPane.setColumnHeaderView(scrollBar);
		
		JLabel lblTotalTime = new JLabel("Total Time");
		lblTotalTime.setBounds(20, 677, 148, 33);
		contentPane.add(lblTotalTime);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(433, 64, 303, 758);
		contentPane.add(scrollPane_1);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollPane_1.setRowHeaderView(scrollBar_1);
		
		JLabel label_2 = new JLabel("Board Size");
		label_2.setBounds(20, 138, 138, 41);
		contentPane.add(label_2);
		
		BoardPanel panel = new BoardPanel();
		panel.setBounds(752, 222, 600, 600);
		contentPane.add(panel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		comboBox.setSelectedIndex(13);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setBounds(230, 138, 53, 45);
		contentPane.add(comboBox);
		
		JLabel label_1 = new JLabel("Level Number");
		label_1.setBounds(10, 206, 112, 14);
		contentPane.add(label_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_1.setBounds(230, 194, 53, 39);
		contentPane.add(comboBox_1);
		
		JButton button = new JButton("Flip Vertically");
		button.setBackground(Color.LIGHT_GRAY);
		button.setBounds(1092, 836, 125, 125);
		contentPane.add(button);
		
		JButton button_2 = new JButton("Rotate Clockwise");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_2.setBackground(Color.LIGHT_GRAY);
		button_2.setBounds(439, 835, 125, 125);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Rotate C. Clockwise");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_3.setBackground(Color.LIGHT_GRAY);
		button_3.setBounds(617, 835, 125, 125);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("Flip Horizontally");
		button_4.setBackground(Color.LIGHT_GRAY);
		button_4.setBounds(1227, 836, 125, 125);
		contentPane.add(button_4);
	}
}
