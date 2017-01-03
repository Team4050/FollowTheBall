package frc.team4050;

import javax.swing.*;

public class GUI extends JFrame {

	/**
	 * Generate a basic JFrame with some basic settings
	 *
	 * @param windowTitle The title which appears at the top of the frame
	 * @param width The initial width of the window
	 * @param height The initial height of the window
	 * @param setVisible You usually want this to be true, this determines if you can see the window or not
	 * @param setResizable This determines whether the user can resize the window using the mouse
	 */
	public GUI(String windowTitle, int width, int height, boolean setVisible, boolean setResizable) {
		setTitle(windowTitle);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(width, height);
		setVisible(setVisible);
		setResizable(setResizable);
	}
}
