package gui;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MessageBox {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter username : ");
		String username = sc.nextLine();
		System.out.println("Enter password : ");
		String Password = sc.next();
//		String username = "Admin";
//		String Password = "123!@#";
		if(username.equals("admin")&& Password.equals("123"))
		{
			
			
			
			JOptionPane.showMessageDialog(null, "Login successful!");
		}
		else {
			JOptionPane.showMessageDialog(null, "invalid Login", "Login Error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "invalid Login", "Login Error", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "invalid Login", "Login Error", JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(null, "invalid Login", "Login Error", JOptionPane.QUESTION_MESSAGE);
			JOptionPane.showMessageDialog(null, "Invalid Login");
		}
		int option = JOptionPane.showConfirmDialog(null, "Do another Yes or No?");
		if(option==0) {
			JOptionPane.showConfirmDialog(null, "Do You remove this item ?","Delete Title",JOptionPane.OK_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
		}
		else if(option == 1) {
			JOptionPane.showConfirmDialog(null, "no");
		}
		else if (option == 2) {
			JOptionPane.showMessageDialog(null, "Cancel");
		}
	}
}
