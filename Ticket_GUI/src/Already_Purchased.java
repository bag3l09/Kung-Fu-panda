import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;


public class Already_Purchased extends JFrame{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Already_Purchased frame = new Already_Purchased();
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
	public Already_Purchased() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("This seat has yet to be purchased");
		lblNewLabel.setBounds(120, 56, 200, 15);
		contentPane.add(lblNewLabel);

		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBounds(175, 232, 85, 21);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(e -> this.dispose());
	}
}
