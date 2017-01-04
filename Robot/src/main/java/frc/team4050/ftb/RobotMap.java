package frc.team4050.ftb;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.TalonSRX;

/**
 * Created by Carson on 1/2/2017.
 */
public class RobotMap {

    public static SpeedController dFrontRightTalon;
    public static SpeedController dFrontLeftTalon;
    public static SpeedController dRearRightTalon;
    public static SpeedController dRearLeftTalon;
    public static RobotDrive dRobotDrive;

    public static SpeedController cElevation;
    public static SpeedController cExtension;
    public static SpeedController cShoot;

    public static void init() {
        //TODO: These definitely will need revisited when able to access the robot
        dFrontRightTalon = new TalonSRX(0);
        dFrontLeftTalon = new TalonSRX(1);
        dRearRightTalon = new TalonSRX(2);
        dRearLeftTalon = new TalonSRX(3);
        dRobotDrive = new RobotDrive(dFrontLeftTalon, dRearLeftTalon, dFrontRightTalon, dRearRightTalon);

        dRobotDrive.setSafetyEnabled(true);
        dRobotDrive.setExpiration(0.1);
        dRobotDrive.setMaxOutput(1.0);
        //dRobotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        //dRobotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        //dRobotDrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        //dRobotDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);

        cElevation = new Talon(4);
        cExtension = new Talon(5);
        cShoot = new Talon(6);

    }
}
