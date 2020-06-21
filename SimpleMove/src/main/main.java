package main;

import javax.swing.JFrame;

import frame.frame;


public class main {

	public static JFrame frame = new JFrame();
	
	public static frame f = new frame();
	
	// Main method
	public static void main(String args[])
	{
		// All frame settings
		frame.setTitle("SimpleMovemint");
		frame.setResizable(false);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		// Add the frame panel
		frame.add(f);
		
		// Set the frame to visible
		frame.setVisible(true);
	}
}
