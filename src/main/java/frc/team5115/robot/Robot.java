package frc.team5115.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import frc.team5115.subsystems.*;

public class Robot extends TimedRobot {
    //Olivia
    //Yeab
    //marie
    public static Arm arm;
    public static Joystick joy;
    public static drivetrain dt;
    public static intakeMech intake;
    public static Gobbler gobbler;

    public void robotInit() {
        joy = new Joystick(0);
        arm = new Arm();
        dt = new drivetrain();
        intake = new intakeMech();
        gobbler = new Gobbler();
    }

    public void teleopPeriodic() {
        arm.moveArm();
        double throttle = (-joy.getRawAxis(3) + 1) / 2;
        dt.drive(joy.getRawAxis(0), joy.getRawAxis(1), throttle); //change thrott with 1-j.getRawAxis(3)
        intake.grabb();
        gobbler.gobble();

    }
}


