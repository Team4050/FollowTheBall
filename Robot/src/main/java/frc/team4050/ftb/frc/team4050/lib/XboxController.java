package frc.team4050.ftb.frc.team4050.lib;

import edu.wpi.first.wpilibj.Joystick;

public class XboxController extends Joystick {


	//Buttens
	public static final int BUTTON_A = 0;
	public static final int BUTTON_B = 1;
	public static final int BUTTON_X = 2;
	public static final int BUTTON_Y = 3;

	public static final int BUTTON_LEFT_BUMPER = 4;
	public static final int BUTTON_RIGHT_BUMPER = 5;

	public static final int BUTTON_LEFT_STICK = 6;
	public static final int BUTTON_RIGHT_STICK = 7;

	public static final int BUTTON_BACK = 8;
	public static final int BUTTON_START = 9;

	//Axes
	public static final int AXES_LEFT_Y = 0;
	public static final int AXES_LEFT_X = 1;
	public static final int AXES_RIGHT_Y = 2;
	public static final int AXES_RIGHT_X = 3;
	public static final int AXES_LEFT_TRIGGER = 4;
	public static final int AXES_RIGHT_TRIGGER = 5;

	public XboxController(int port) {
		super(port);
	}
}
