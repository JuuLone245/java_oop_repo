package gui;

import java.awt.*;

import javax.swing.*;

public class JFrameTest3 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500,350));
		frame.setLocation(new Point(200,100));
		frame.setIconImage(new ImageIcon("src/gui/sunrise.png").getImage());
		
		frame.setLayout(new GridLayout());
		JButton btnLogin = new JButton();
		btnLogin.setText("Log In");
		btnLogin.setBackground(Color.pink);
		frame.add(btnLogin);
		
		JButton btnCancel = new JButton();
		btnCancel.setText("Cancel");
		btnCancel.setBackground(Color.cyan);
		frame.add(btnCancel);
		
		JLabel lb1 = new JLabel();
		lb1.setText("Hello World");
		lb1.setForeground(Color.red);
		frame.add(lb1);
		
		JButton btnOk = new JButton();
		btnOk.setText("OK");
		btnOk.setBackground(Color.green);
		frame.add(btnOk);
		
		
		
		
		
		

	}

}
