import javax.swing.*;

public class BasicElements{

	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Basic Java GUI");
		JButton myButton = new JButton("Login");
		myFrame.setLayout(null);
		
		myFrame.add(myButton);
		myButton.setSize(200, 50);

		myFrame.setVisible(true);
		myFrame.setSize(900, 600);
		myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
		
		System.out.println("basic java elements");
	}
}