package br.com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.controller.UserLoger;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoguinUser extends JFrame {

	private JPanel contentPane;
	private JTextField in_user;
	private JTextField in_password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoguinUser frame = new LoguinUser();
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
	public LoguinUser() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User");
		lblNewLabel.setBounds(61, 82, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setBounds(61, 125, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		in_user = new JTextField();
		in_user.setBounds(104, 79, 192, 20);
		contentPane.add(in_user);
		in_user.setColumns(10);
		
		in_password = new JTextField();
		in_password.setBounds(104, 122, 192, 20);
		contentPane.add(in_password);
		in_password.setColumns(10);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				UserLoger us = new UserLoger();
				
				if(us.validationLoguin(in_user.getText(), in_password.getText())){
					JOptionPane.showConfirmDialog(contentPane, "Ok, " + in_user.getText(), "Login efetuado!",JOptionPane.YES_OPTION);
				}else {
					JOptionPane.showMessageDialog(contentPane, "Desculpe, mas você errou o login ou a senha ", "Login negado!", JOptionPane.ERROR_MESSAGE);

				}
				
				in_user.setText("");
				in_password.setText("");
				
				
			}
		});
		btnNewButton.setBounds(191, 198, 89, 23);
		contentPane.add(btnNewButton);
	}
}
