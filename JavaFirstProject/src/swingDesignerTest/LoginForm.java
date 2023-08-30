package swingDesignerTest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setTitle("Login Page");
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginForm.class.getResource("/gui/sunrise.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Pyidaungsu", Font.BOLD, 14));
		lblUserName.setForeground(new Color(255, 128, 0));
		lblUserName.setBounds(42, 77, 71, 17);
		contentPane.add(lblUserName);
		
		textField = new JTextField();
		textField.setBounds(121, 75, 96, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(255, 128, 0));
		lblPassword.setFont(new Font("Pyidaungsu", Font.BOLD, 14));
		lblPassword.setBounds(42, 135, 71, 17);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(121, 133, 96, 23);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Login successfully");
			}
		});
		btnLogin.setFont(new Font("Pyidaungsu", Font.BOLD, 15));
		btnLogin.setBackground(new Color(255, 255, 255));
		btnLogin.setForeground(new Color(255, 128, 0));
		btnLogin.setBounds(71, 188, 83, 25);
		contentPane.add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setForeground(new Color(255, 128, 0));
		btnCancel.setFont(new Font("Pyidaungsu", Font.BOLD, 15));
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(199, 189, 83, 25);
		contentPane.add(btnCancel);
	}
}
