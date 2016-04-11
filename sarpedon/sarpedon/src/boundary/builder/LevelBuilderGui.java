package boundary.builder;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class LevelBuilderGui extends JFrame {

	private JPanel contentPane;
	
	JButton btnLightningBuilder;
	JButton btnPuzzleBuilder;
	JButton btnReleaseBuilder;
	JButton btnEditExisting;
	
	JLabel lblKabasujiLevelBuilder;
	JLabel lblSelectTheType;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LevelBuilderGui frame = new LevelBuilderGui();
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
	public LevelBuilderGui() {
		setTitle("Kabasuji Level Builder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 10, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnPuzzleBuilder = new JButton("Puzzle Builder");
		btnPuzzleBuilder.setBackground(Color.LIGHT_GRAY);
		btnPuzzleBuilder.setForeground(Color.BLUE);
		btnPuzzleBuilder.setBounds(575, 279, 350, 60);
		contentPane.add(btnPuzzleBuilder);
		
		btnLightningBuilder = new JButton("Lightning Builder");
		btnLightningBuilder.setForeground(Color.GREEN);
		btnLightningBuilder.setBackground(Color.LIGHT_GRAY);
		btnLightningBuilder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLightningBuilder.setBounds(575, 446, 350, 60);
		contentPane.add(btnLightningBuilder);
		
		btnReleaseBuilder = new JButton("Release Builder");
		btnReleaseBuilder.setBackground(Color.LIGHT_GRAY);
		btnReleaseBuilder.setForeground(Color.RED);
		btnReleaseBuilder.setBounds(575, 617, 350, 60);
		contentPane.add(btnReleaseBuilder);
		
		lblKabasujiLevelBuilder = new JLabel("KabaSuji Level Builder");
		lblKabasujiLevelBuilder.setFont(new Font("Tahoma", Font.PLAIN, 52));
		lblKabasujiLevelBuilder.setBounds(494, 59, 647, 75);
		contentPane.add(lblKabasujiLevelBuilder);
		
		lblSelectTheType = new JLabel("Select the type of level you wish to build");
		lblSelectTheType.setBounds(646, 145, 239, 60);
		contentPane.add(lblSelectTheType);
		
		btnEditExisting = new JButton("Edit Existing Level");
		btnEditExisting.setBackground(Color.LIGHT_GRAY);
		btnEditExisting.setBounds(575, 809, 350, 60);
		contentPane.add(btnEditExisting);
	}
}