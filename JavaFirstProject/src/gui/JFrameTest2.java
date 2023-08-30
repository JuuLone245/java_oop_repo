package gui;
import javax.swing.*;

import java.awt.*;
public class JFrameTest2 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(100,100);
		frame.setLocation(new Point(200,100));
		frame.setTitle("Window Page");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new BorderLayout());
		
		JButton btnlogin = new JButton();
		btnlogin.setText("Log in Button");
		btnlogin.setBackground(Color.pink);
		
		frame.add(btnlogin,BorderLayout.EAST);

		JButton btncancel = new JButton();
		btncancel.setText("Cancel Button");
		btncancel.setBackground(Color.cyan);
		
		frame.add(btncancel,BorderLayout.WEST);
		

		JButton btnclick = new JButton();
		btnclick.setText("Click Button");
		btnclick.setBackground(Color.blue);
		
		frame.add(btnclick,BorderLayout.NORTH);
		

		JButton btnok = new JButton();
		btnok.setText("OK Button");
		btnok.setBackground(Color.red);
		
		frame.add(btnok,BorderLayout.CENTER);
//		Image icon
		Image icon = Toolkit.getDefaultToolkit().getImage("src/gui/sunrise.png");
		frame.setIconImage(icon);
		
	}

}
