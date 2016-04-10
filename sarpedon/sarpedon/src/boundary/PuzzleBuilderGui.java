package boundary;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollBar;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;

public class PuzzleBuilderGui extends JFrame {

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
					PuzzleBuilderGui frame = new PuzzleBuilderGui();
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
	public PuzzleBuilderGui() {
		setTitle("Kabasuji Puzzle Level Builder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(744, 207, 600, 600);
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(748, 48, 596, 148);
		contentPane.add(scrollPane);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setOrientation(JScrollBar.HORIZONTAL);
		scrollPane.setColumnHeaderView(scrollBar);
		
		JLabel lblTotalMoves = new JLabel("Total Moves");
		lblTotalMoves.setBounds(16, 682, 148, 33);
		contentPane.add(lblTotalMoves);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(429, 48, 303, 775);
		contentPane.add(scrollPane_1);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollPane_1.setRowHeaderView(scrollBar_1);
		
		JLabel lblBoardsize = new JLabel("Board Size");
		lblBoardsize.setBounds(16, 143, 138, 41);
		contentPane.add(lblBoardsize);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		comboBox.setSelectedIndex(13);
		comboBox.setBounds(242, 141, 53, 45);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(190, 679, 105, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Possible Warning");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(26, 745, 251, 33);
		contentPane.add(lblNewLabel);
		
		JButton btnSaveAndQuit = new JButton("Save");
		btnSaveAndQuit.setBounds(26, 28, 279, 41);
		contentPane.add(btnSaveAndQuit);
		
		JButton btnUndo = new JButton("Undo");
		btnUndo.setBounds(26, 84, 112, 41);
		contentPane.add(btnUndo);
		
		JRadioButton rdbtnAddHint = new JRadioButton("Add Hint");
		rdbtnAddHint.setBackground(Color.WHITE);
		buttonGroup.add(rdbtnAddHint);
		rdbtnAddHint.setBounds(82, 361, 251, 41);
		contentPane.add(rdbtnAddHint);
		
		JRadioButton rdbtnMovePieces = new JRadioButton("Move Pieces");
		rdbtnMovePieces.setBackground(Color.WHITE);
		buttonGroup.add(rdbtnMovePieces);
		rdbtnMovePieces.setBounds(82, 422, 251, 41);
		contentPane.add(rdbtnMovePieces);
		
		JRadioButton rdbtnAddremoveTiles = new JRadioButton("Move Tiles");
		rdbtnAddremoveTiles.setBackground(Color.WHITE);
		buttonGroup.add(rdbtnAddremoveTiles);
		rdbtnAddremoveTiles.setBounds(82, 483, 251, 41);
		contentPane.add(rdbtnAddremoveTiles);
		
		JLabel label = new JLabel("Level Number");
		label.setBounds(10, 241, 105, 14);
		contentPane.add(label);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_1.setBounds(242, 226, 53, 39);
		contentPane.add(comboBox_1);
		
		JButton button = new JButton("Flip Vertically");
		button.setBackground(Color.LIGHT_GRAY);
		button.setBounds(1082, 818, 125, 125);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Rotate Clockwise");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.setBounds(429, 834, 125, 125);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Rotate C. Clockwise");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_2.setBackground(Color.LIGHT_GRAY);
		button_2.setBounds(607, 834, 125, 125);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Flip Horizontally");
		button_3.setBackground(Color.LIGHT_GRAY);
		button_3.setBounds(1217, 818, 125, 125);
		contentPane.add(button_3);
	}
}
