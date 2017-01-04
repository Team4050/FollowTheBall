package frc.team4050.ftb;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

/**
 * Created by Carson on 1/2/2017.
 */
public class OI {

    public Joystick xbox;
    public Joystick joy1;
    public Joystick joy2;

    public NetworkTable visionData;

    public OI() {
        xbox = new Joystick(0);
        joy1 = new Joystick(1);
        joy2 = new Joystick(2);

        visionData = NetworkTable.getTable("visionDataTable");
    }

    public Joystick getXbox() {
        return xbox;
    }

    public Joystick getJoy1() {
        return joy1;
    }

    public Joystick getJoy2() {
        return joy2;
    }

}
