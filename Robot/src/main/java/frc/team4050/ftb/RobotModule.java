package frc.team4050.ftb;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import jaci.openrio.toast.lib.module.IterativeModule;

public class RobotModule extends IterativeModule {

    Command autonomousCommand;

    public static OI oi;

    @Override
    public String getModuleName() {
        return "FTB";
    }

    @Override
    public String getModuleVersion() {
        return "0.0.1";
    }

    @Override
    public void robotInit() {
        RobotMap.init();
        oi = new OI();
    }

    public void teleopInit() {
        if(autonomousCommand != null) {
            autonomousCommand.cancel();
        }
    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    public void autonomousInit() {
        if(autonomousCommand != null) {
            autonomousCommand.start();
        }
    }

    public void disabledInit() {

    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    public void testInit() {

    }

    public void testPeriodic() {
        Scheduler.getInstance().run();
    }
}
