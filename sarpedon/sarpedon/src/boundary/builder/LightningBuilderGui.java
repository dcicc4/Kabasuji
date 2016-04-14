package boundary.builder;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;

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
	private JTextField timeTextField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
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
	
	BuilderBullpenPanel bullpen;
	BuilderStockPanel stock;
	
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
		setBounds(100, 10, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		timeTextField = new JTextField();
		timeTextField.setColumns(10);
		timeTextField.setBounds(178, 674, 105, 39);
		contentPane.add(timeTextField);
		
		JLabel warningLabel = new JLabel("Possible Warning");
		warningLabel.setHorizontalAlignment(SwingConstants.CENTER);
		warningLabel.setForeground(Color.RED);
		warningLabel.setBounds(10, 728, 251, 33);
		contentPane.add(warningLabel);
		
		btnSave = new JButton("Save");
		btnSave.setBounds(10, 11, 279, 41);
		contentPane.add(btnSave);
		
		btnUndo = new JButton("Undo");
		btnUndo.setBounds(10, 67, 279, 41);
		contentPane.add(btnUndo);
		
		addHintRadio = new JRadioButton("Add Hint");
		buttonGroup.add(addHintRadio);
		addHintRadio.setBackground(Color.WHITE);
		addHintRadio.setBounds(66, 344, 251, 41);
		contentPane.add(addHintRadio);
		
		movePiecesRadio = new JRadioButton("Move Pieces");
		movePiecesRadio.setSelected(true);
		buttonGroup.add(movePiecesRadio);
		movePiecesRadio.setBackground(Color.WHITE);
		movePiecesRadio.setBounds(66, 405, 251, 41);
		contentPane.add(movePiecesRadio);
		
		moveTilesRadio = new JRadioButton("Move Tiles");
		buttonGroup.add(moveTilesRadio);
		moveTilesRadio.setBackground(Color.WHITE);
		moveTilesRadio.setBounds(66, 466, 251, 41);
		contentPane.add(moveTilesRadio);
		
		JScrollPane bullpenScrollPane = new JScrollPane();
		bullpenScrollPane.setBounds(752, 63, 600, 157);
		contentPane.add(bullpenScrollPane);
		
		bullpen = new BuilderBullpenPanel();
		bullpen.setPreferredSize(new Dimension(1000, 130));
		bullpenScrollPane.setViewportView(bullpen);
		
		JLabel lblTotalTime = new JLabel("Total Time");
		lblTotalTime.setBounds(20, 677, 148, 33);
		contentPane.add(lblTotalTime);
		
		JScrollPane stockScrollPane = new JScrollPane();
		stockScrollPane.setBounds(433, 64, 316, 758);
		contentPane.add(stockScrollPane);
		
		stock = new BuilderStockPanel();
		stock.setPreferredSize(new Dimension(280, 1200));
		stockScrollPane.setViewportView(stock);
		
		JLabel label_2 = new JLabel("Board Size");
		label_2.setBounds(20, 138, 138, 41);
		contentPane.add(label_2);
		
		BuilderBoardPanel panel = new BuilderBoardPanel();
		panel.setBounds(752, 222, 600, 600);
		contentPane.add(panel);
		
		boardSizeCombo = new JComboBox();
		boardSizeCombo.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		boardSizeCombo.setSelectedIndex(13);
		boardSizeCombo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		boardSizeCombo.setBounds(211, 138, 72, 45);
		contentPane.add(boardSizeCombo);
		
		JLabel label_1 = new JLabel("Level Number");
		label_1.setBounds(10, 206, 112, 14);
		contentPane.add(label_1);
		
		levelNumberCombo = new JComboBox();
		levelNumberCombo.setModel(new DefaultComboBoxModel(new String[] {"none","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"}));
		levelNumberCombo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		levelNumberCombo.setBounds(211, 194, 72, 39);
		contentPane.add(levelNumberCombo);
		
		btnFlipVert = new JButton("Flip Vertically");
		btnFlipVert.setBackground(Color.LIGHT_GRAY);
		btnFlipVert.setBounds(1074, 833, 125, 125);
		contentPane.add(btnFlipVert);
		
		btnRotateClockwise = new JButton("Rotate Clockwise");
		btnRotateClockwise.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnRotateClockwise.setBackground(Color.LIGHT_GRAY);
		btnRotateClockwise.setBounds(752, 833, 125, 125);
		contentPane.add(btnRotateClockwise);
		
		btnRotateCClockwise = new JButton("Rotate C. Clockwise");
		btnRotateCClockwise.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnRotateCClockwise.setBackground(Color.LIGHT_GRAY);
		btnRotateCClockwise.setBounds(913, 833, 125, 125);
		contentPane.add(btnRotateCClockwise);
		
		btnFlipHor = new JButton("Flip Horizontally");
		btnFlipHor.setBackground(Color.LIGHT_GRAY);
		btnFlipHor.setBounds(1227, 833, 125, 125);
		contentPane.add(btnFlipHor);
	}
}
