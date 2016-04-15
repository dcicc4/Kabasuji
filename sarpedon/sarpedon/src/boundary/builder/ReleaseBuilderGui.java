package boundary.builder;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.builder.AddPieceToBullpenController;
import entity.builder.BuilderModel;
import entity.player.Bullpen;

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
	JRadioButton rdbtnNumberTile;
	
	JComboBox boardSizeCombo;
	JComboBox levelNumberCombo;
	JComboBox colorCombo;
	JComboBox numberCombo;
	
	BuilderBullpenPanel bullpenView;
	BuilderStockPanel stockView;

	
	BuilderModel model;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ReleaseBuilderGui frame = new ReleaseBuilderGui();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public ReleaseBuilderGui(BuilderModel bm) {
		model = bm;
		
		
		setTitle("Kabasuji Release Level Builder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 10, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		warningLabel = new JLabel("Possible Warning");
		warningLabel.setHorizontalAlignment(SwingConstants.CENTER);
		warningLabel.setForeground(Color.RED);
		warningLabel.setBounds(25, 741, 251, 33);
		contentPane.add(warningLabel);
		
		btnSave = new JButton("Save");
		btnSave.setBackground(Color.LIGHT_GRAY);
		btnSave.setBounds(25, 24, 279, 41);
		contentPane.add(btnSave);
		
		btnUndo = new JButton("Undo");
		btnUndo.setBackground(Color.LIGHT_GRAY);
		btnUndo.setBounds(25, 80, 279, 41);
		contentPane.add(btnUndo);
		
		 addHintRadio = new JRadioButton("Add Hint");
		buttonGroup.add(addHintRadio);
		addHintRadio.setBackground(Color.WHITE);
		addHintRadio.setBounds(81, 357, 251, 41);
		contentPane.add(addHintRadio);
		
		movePiecesRadio = new JRadioButton("Move Pieces");
		movePiecesRadio.setSelected(true);
		buttonGroup.add(movePiecesRadio);
		movePiecesRadio.setBackground(Color.WHITE);
		movePiecesRadio.setBounds(81, 418, 251, 41);
		contentPane.add(movePiecesRadio);
		
		moveTilesRadio = new JRadioButton("Move Tiles");
		buttonGroup.add(moveTilesRadio);
		moveTilesRadio.setBackground(Color.WHITE);
		moveTilesRadio.setBounds(81, 479, 251, 41);
		contentPane.add(moveTilesRadio);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(767, 54, 600, 148);
		contentPane.add(scrollPane);
		
		bullpenView = new BuilderBullpenPanel(model.getBullpen());
		scrollPane.setViewportView(bullpenView);
		
		JScrollPane stockScrollPane = new JScrollPane();
		stockScrollPane.setBounds(440, 54, 323, 758);
		contentPane.add(stockScrollPane);
		
		stockView = new BuilderStockPanel();
		stockScrollPane.setViewportView(stockView);
		
		JLabel label_2 = new JLabel("Board Size");
		label_2.setBounds(35, 151, 138, 41);
		contentPane.add(label_2);
		
		boardSizeCombo = new JComboBox();
		boardSizeCombo.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		boardSizeCombo.setSelectedIndex(13);
		boardSizeCombo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		boardSizeCombo.setBounds(223, 151, 75, 45);
		contentPane.add(boardSizeCombo);
		
		BuilderBoardPanel panel = new BuilderBoardPanel();
		panel.setBounds(767, 213, 600, 600);
		contentPane.add(panel);
		
		rdbtnNumberTile = new JRadioButton("Number Tile");
		buttonGroup.add(rdbtnNumberTile);
		rdbtnNumberTile.setBackground(Color.WHITE);
		rdbtnNumberTile.setBounds(81, 548, 109, 23);
		contentPane.add(rdbtnNumberTile);
		
		colorCombo = new JComboBox();
		colorCombo.setModel(new DefaultComboBoxModel(new String[] {"Red", "Green", "Blue"}));
		colorCombo.setSelectedIndex(1);
		colorCombo.setBounds(155, 578, 64, 20);
		contentPane.add(colorCombo);
		
		numberCombo = new JComboBox();
		numberCombo.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6"}));
		numberCombo.setBounds(155, 609, 64, 20);
		contentPane.add(numberCombo);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(108, 581, 37, 14);
		contentPane.add(lblColor);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setBounds(108, 612, 53, 14);
		contentPane.add(lblNumber);
		
		JLabel lblNewLabel = new JLabel("Level Number");
		lblNewLabel.setBounds(25, 247, 105, 14);
		contentPane.add(lblNewLabel);
		
		levelNumberCombo = new JComboBox();
		levelNumberCombo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		levelNumberCombo.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"}));
		levelNumberCombo.setBounds(223, 235, 75, 39);
		contentPane.add(levelNumberCombo);
		
		btnRotateClockwise = new JButton("Rotate Clockwise");
		btnRotateClockwise.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnRotateClockwise.setBackground(Color.LIGHT_GRAY);
		btnRotateClockwise.setBounds(767, 824, 125, 125);
		contentPane.add(btnRotateClockwise);
		
		btnRotateCClockwise = new JButton("Rotate C. Clockwise");
		btnRotateCClockwise.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnRotateCClockwise.setBackground(Color.LIGHT_GRAY);
		btnRotateCClockwise.setBounds(931, 824, 125, 125);
		contentPane.add(btnRotateCClockwise);
		
		btnFlipVert = new JButton("Flip Vertically");
		btnFlipVert.setBackground(Color.LIGHT_GRAY);
		btnFlipVert.setBounds(1088, 824, 125, 125);
		contentPane.add(btnFlipVert);
		
		btnFlipHor = new JButton("Flip Horizontally");
		btnFlipHor.setBackground(Color.LIGHT_GRAY);
		btnFlipHor.setBounds(1242, 824, 125, 125);
		contentPane.add(btnFlipHor);
		
		//install controllers
		AddPieceToBullpenController apb = new AddPieceToBullpenController(model.getBullpen(), stockView, bullpenView);
		stockView.addMouseListener(apb);
	}
}
