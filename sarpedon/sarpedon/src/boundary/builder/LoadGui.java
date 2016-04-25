package boundary.builder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.builder.LoadExistingToEditController;

import javax.swing.JTextField;
import javax.swing.JButton;

public class LoadGui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	JButton btnLoad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoadGui frame = new LoadGui();
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
	public LoadGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 100);
		setTitle("Enter the Name of the Level You Want to Load");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 263, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnLoad = new JButton("Load");
		btnLoad.setBounds(283, 11, 127, 41);
		contentPane.add(btnLoad);
		
		btnLoad.addActionListener(new LoadExistingToEditController(textField, this));
	}
}
