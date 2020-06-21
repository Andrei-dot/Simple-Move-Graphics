package frame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class frame extends JPanel implements KeyListener,ActionListener {
	
	private int playerX = 350;
	private int playerY = 350;
	
	Timer t = new Timer(5, this);
	
	// Constructor
	public frame()
	{
		// Add key listener for wait input from keyboard
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}
	
	// Paint method
	public void paint(Graphics g)
	{
		// Draw the background
		
		g.setColor(Color.black);
		g.fillRect(0, 0, 500, 500);
		
		// Draw the oval
		
		g.setColor(Color.white);
		g.fillOval(playerX, playerY, 20, 20);
		
		// Start the timer 
		
		t.start();
	}

	// Method to move left
	public void moveLeft()
	{
		playerX -= 10;
	}
	
	// Method to move right
	public void moveRight()
	{
		playerX += 10;
	}
	
	// Method to move up 
	public void moveUp()
	{
		playerY -= 10;
	}
	
	// Method to move down 
	public void moveDown()
	{
		playerY += 10;
	}
	
	
	// Method to repaint Graphics
	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}
	
	// The method who will move the oval when one key is pressed.
	@Override
	public void keyPressed(KeyEvent e) {
		// If key pressed = right arrow => Execute the method moveRight();
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			moveRight();
		}
		// If key pressed = left arrow => Execute the method moveLeft();
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			moveLeft();
		}
		// If key pressed = up arrow => Execute the method moveUp();
		if(e.getKeyCode() == KeyEvent.VK_UP)
		{
			moveUp();
		}
		// If key pressed = down arrow => Execute the method downRight();
		if(e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			moveDown();
		}
	}
	
	// Some useless methods
	
	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
}
