package boundary.builder;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.builder.AddPieceToBullpenController;
import control.builder.BoardSizeController;
import control.builder.BullpenToBoardController;
import control.builder.FlipController;
import control.builder.MoveTilesController;
import control.builder.PlacePieceController;
import control.builder.RotateController;
import control.builder.SelectPieceController;
import entity.builder.BuildableLightning;
import entity.builder.BuilderModel;
import entity.builder.IBuilderModel;
import entity.player.Bullpen;

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
/**
 * The interface for the Lighting Level Builder
 * @author Nathan
 *
 */
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
	
	JComboBox<Integer> boardSizeCombo;
	JComboBox<Integer> levelNumberCombo;
	
	BuilderBullpenPanel bullpenView;
	BuilderStockPanel stockView;
	BuilderBoardPanel boardView;
	
	BuildableLightning model;
	
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					LightningBuilderGui frame = new LightningBuilderGui();
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
	public LightningBuilderGui(IBuilderModel bm) {
		model = new BuildableLightning();
		
		model.setType("Lightning");
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
		
		bullpenView = new BuilderBullpenPanel(model.getBullpen());
		bullpenView.setPreferredSize(new Dimension(1000, 130));
		bullpenScrollPane.setViewportView(bullpenView);
		
		JLabel lblTotalTime = new JLabel("Total Time");
		lblTotalTime.setBounds(20, 677, 148, 33);
		contentPane.add(lblTotalTime);
		
		JScrollPane stockScrollPane = new JScrollPane();
		stockScrollPane.setBounds(433, 64, 316, 758);
		contentPane.add(stockScrollPane);
		
		stockView = new BuilderStockPanel();
		stockView.setPreferredSize(new Dimension(280, 1200));
		stockScrollPane.setViewportView(stockView);
		
		JLabel label_2 = new JLabel("Board Size");
		label_2.setBounds(20, 138, 138, 41);
		contentPane.add(label_2);
		
		boardView = new BuilderBoardPanel(model);
		boardView.setBounds(752, 222, 600, 600);
		contentPane.add(boardView);
		
		boardSizeCombo = new JComboBox<Integer>();
		boardSizeCombo.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24}));
		boardSizeCombo.setSelectedIndex(23);
		boardSizeCombo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		boardSizeCombo.setBounds(211, 138, 72, 45);
		contentPane.add(boardSizeCombo);
		
		JLabel label_1 = new JLabel("Level Number");
		label_1.setBounds(10, 206, 112, 14);
		contentPane.add(label_1);
		
		levelNumberCombo = new JComboBox<Integer>();
		levelNumberCombo.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}));
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
		
		//Install controllers
		AddPieceToBullpenController apb = new AddPieceToBullpenController(model.getBullpen(), stockView, bullpenView);
		stockView.addMouseListener(apb);
		SelectPieceController spc = new SelectPieceController(model.getBullpen(), boardView, bullpenView, movePiecesRadio);
		bullpenView.addMouseListener(spc);

		BullpenToBoardController movePiece = new BullpenToBoardController(model.getBoard(), model.getBullpen(), boardView, bullpenView);
		boardView.addMouseMotionListener(movePiece);
		PlacePieceController place = new PlacePieceController(model, boardView, movePiecesRadio);
		boardView.addMouseListener(place);
		MoveTilesController mtc = new MoveTilesController(model, boardView, moveTilesRadio);
		boardView.addMouseListener(mtc);
		boardView.addMouseMotionListener(mtc);
		
		btnFlipVert.addActionListener(new FlipController(boardView, model, true));
		btnFlipHor.addActionListener(new FlipController(boardView, model, false));
		btnRotateClockwise.addActionListener(new RotateController(boardView, model, true));
		btnRotateCClockwise.addActionListener(new RotateController(boardView, model, false));
		BoardSizeController size = new BoardSizeController(boardSizeCombo, boardView, bullpenView, model);
		boardSizeCombo.addActionListener(size);
	}
}
