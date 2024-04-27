import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class ticket_GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnReturnTicket;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticket_GUI frame = new ticket_GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//////////////////////////////////////////////////////////////
	//Function for array
	
	
	/////////////////////////////////////////////////////////
	
	//checks if theater is full or not
	public boolean ArtistTheaterFull(Map<String, Boolean> seats) {
		return !seats.containsValue(false);
	}
	
	//Buys a ticket and pulls up the ticket purchased gui and calls the updateSeats function to update dictionary and gui 
	public void BuyTicket() {
		
	}
	
	/**
	 * Create the frame.
	 */
	public ticket_GUI() {
		setTitle("The Artist Theater");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("April 20, 1:00 PM");
		rdbtnNewRadioButton.setBounds(153, 35, 150, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnApril = new JRadioButton("April 28, 8:00 PM");
		rdbtnApril.setBounds(153, 61, 150, 21);
		contentPane.add(rdbtnApril);
		
		btnNewButton = new JButton("Buy Ticket");
		btnNewButton.setBounds(100, 232, 120, 21);
		contentPane.add(btnNewButton);
		
		btnReturnTicket = new JButton("Return Ticket");
		btnReturnTicket.setBounds(234, 232, 120, 21);
		contentPane.add(btnReturnTicket);
		
		JLabel lblNewLabel = new JLabel("Kung Fu Panda 4 Showings:");
		lblNewLabel.setBounds(143, 10, 200, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblThereAre = new JLabel("There are 3 seat rows:");
		lblThereAre.setBounds(153, 88, 130, 13);
		contentPane.add(lblThereAre);
		
		JLabel lblaAA = new JLabel("[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]");
		lblaAA.setBounds(119, 111, 230, 13);
		contentPane.add(lblaAA);
		
		JLabel lblbBB = new JLabel("[B1, B2, B3, B4, B5, B6, B7, B8, B9, B10]");
		lblbBB.setBounds(119, 122, 230, 13);
		contentPane.add(lblbBB);
		
		JLabel lblaAC = new JLabel("[C1, C2, C3, C4, C5, C6, C7, C8, C9, C10]");
		lblaAC.setBounds(119, 134, 230, 13);
		contentPane.add(lblaAC);
		
		textField = new JTextField();
		textField.setBounds(153, 190, 100, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Enter seat Number:");
		lblNewLabel_1.setBounds(153, 169, 120, 13);
		contentPane.add(lblNewLabel_1);
		
		ButtonGroup editableGroup = new ButtonGroup();
		editableGroup.add(rdbtnNewRadioButton);
		editableGroup.add(rdbtnApril);
		
		btnNewButton.addActionListener(new ActionListener() {
		//Action performed for "Buy Ticket"
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) { 
					//making seat reserved
								
						}
				else if(rdbtnApril.isSelected()) {
								
					//making seat reserved
					}
							
			// All fields are cleared to allow for new purchase
					textField.setText("");
					editableGroup.clearSelection();
							
				}
			
	});
	}
}
