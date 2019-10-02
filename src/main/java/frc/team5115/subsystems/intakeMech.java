package frc.team5115.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Spark;

import static frc.team5115.robot.Robot.joy;

public class intakeMech {
    public DoubleSolenoid leftAbove;
    public DoubleSolenoid rightAbove;
    public DoubleSolenoid leftBelow;
    public DoubleSolenoid rightBelow;

    public Spark leftIntake;
    public Spark rightIntake;

    public intakeMech()
    {
        leftAbove = new DoubleSolenoid(7, 6, 7);
        rightAbove = new DoubleSolenoid(7, 5,4);
        leftBelow = new DoubleSolenoid(8,0,1);
        // weird grabby thing leftBelow = new DoubleSolenoid(8,0,1);
        rightBelow = new DoubleSolenoid(8,2,3);

        //leftIntake = new Spark(4);
        //rightIntake = new Spark(4);
    }
    public void grabb(){
        if(joy.getRawButton(8)) {
            //intake goes down
            leftAbove.set(DoubleSolenoid.Value.kReverse);
            rightAbove.set(DoubleSolenoid.Value.kReverse);
            //intake opens
            leftBelow.set(DoubleSolenoid.Value.kForward);
            rightBelow.set(DoubleSolenoid.Value.kForward);
        }

        else if(joy.getRawButton(9)){
            leftAbove.set(DoubleSolenoid.Value.kForward);
            rightAbove.set(DoubleSolenoid.Value.kForward);
            leftBelow.set(DoubleSolenoid.Value.kReverse);
            rightBelow.set(DoubleSolenoid.Value.kReverse);
        }

        else{
            leftAbove.set(DoubleSolenoid.Value.kOff);
            rightAbove.set(DoubleSolenoid.Value.kOff);
            leftBelow.set(DoubleSolenoid.Value.kOff);
            rightBelow.set(DoubleSolenoid.Value.kOff);
        }

    }
}

