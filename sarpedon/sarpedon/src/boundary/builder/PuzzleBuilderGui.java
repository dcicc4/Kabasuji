package boundary.builder;
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
	
	JLabel warningLabel;
	
	JButton btnSave;
	JButton btnUndo;

	JButton btnFlipVert;
	JButton btnFlipHor;
	JButton btnRotateClockwise;
	JButton btnRotateCClockwise;
	
	JRadioButton addHintRadio;
	JRadioButton movePiecesRadio;
	JRadioButton moveTilesRadio;
	
	JComboBox boardSizeCombo;
	JComboBox levelNumberCombo;

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
		setBounds(100, 10, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		BuilderBoardPanel panel = new BuilderBoardPanel();
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
		
		boardSizeCombo = new JComboBox();
		boardSizeCombo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		boardSizeCombo.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		boardSizeCombo.setSelectedIndex(13);
		boardSizeCombo.setBounds(242, 141, 53, 45);
		contentPane.add(boardSizeCombo);
		
		textField = new JTextField();
		textField.setBounds(190, 679, 105, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		warningLabel = new JLabel("Possible Warning");
		warningLabel.setHorizontalAlignment(SwingConstants.CENTER);
		warningLabel.setForeground(Color.RED);
		warningLabel.setBounds(26, 745, 251, 33);
		contentPane.add(warningLabel);
		
		btnSave = new JButton("Save");
		btnSave.setBounds(26, 28, 279, 41);
		contentPane.add(btnSave);
		
		btnUndo = new JButton("Undo");
		btnUndo.setBounds(26, 84, 112, 41);
		contentPane.add(btnUndo);
		
		addHintRadio = new JRadioButton("Add Hint");
		addHintRadio.setBackground(Color.WHITE);
		buttonGroup.add(addHintRadio);
		addHintRadio.setBounds(82, 361, 251, 41);
		contentPane.add(addHintRadio);
		
		addHintRadio = new JRadioButton("Move Pieces");
		addHintRadio.setBackground(Color.WHITE);
		buttonGroup.add(addHintRadio);
		addHintRadio.setBounds(82, 422, 251, 41);
		contentPane.add(addHintRadio);
		
		movePiecesRadio = new JRadioButton("Move Tiles");
		movePiecesRadio.setBackground(Color.WHITE);
		buttonGroup.add(movePiecesRadio);
		movePiecesRadio.setBounds(82, 483, 251, 41);
		contentPane.add(movePiecesRadio);
		
		JLabel label = new JLabel("Level Number");
		label.setBounds(10, 241, 105, 14);
		contentPane.add(label);
		
		levelNumberCombo = new JComboBox();
		levelNumberCombo.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"}));
		levelNumberCombo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		levelNumberCombo.setBounds(242, 226, 53, 39);
		contentPane.add(levelNumberCombo);
		
		JButton btnFlipVert = new JButton("Flip Vertically");
		btnFlipVert.setBackground(Color.LIGHT_GRAY);
		btnFlipVert.setBounds(1082, 818, 125, 125);
		contentPane.add(btnFlipVert);
		
		btnRotateClockwise = new JButton("Rotate Clockwise");
		btnRotateClockwise.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnRotateClockwise.setBackground(Color.LIGHT_GRAY);
		btnRotateClockwise.setBounds(429, 834, 125, 125);
		contentPane.add(btnRotateClockwise);
		
		btnRotateCClockwise = new JButton("Rotate C. Clockwise");
		btnRotateCClockwise.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnRotateCClockwise.setBackground(Color.LIGHT_GRAY);
		btnRotateCClockwise.setBounds(607, 834, 125, 125);
		contentPane.add(btnRotateCClockwise);
		
		btnFlipHor = new JButton("Flip Horizontally");
		btnFlipHor.setBackground(Color.LIGHT_GRAY);
		btnFlipHor.setBounds(1217, 818, 125, 125);
		contentPane.add(btnFlipHor);
	}
}
