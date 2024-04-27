import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class ticket_returned extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticket_returned frame = new ticket_returned();
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
	public ticket_returned() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBounds(197, 232, 60, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("The following ticket has been returned:");
		lblNewLabel.setBounds(136, 44, 300, 13);
		contentPane.add(lblNewLabel);
		btnNewButton.addActionListener(e -> this.dispose());
		
		JLabel lblNewLabel_1 = new JLabel("On the date of:");
		lblNewLabel_1.setBounds(178, 98, 200, 13);
		contentPane.add(lblNewLabel_1);
	}

}
