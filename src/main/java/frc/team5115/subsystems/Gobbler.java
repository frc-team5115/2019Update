package frc.team5115.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.DigitalInput;

import static frc.team5115.robot.Robot.joy;

public class Gobbler {
    VictorSPX center;
    DigitalInput ballcheck;
    boolean directionswitch;

    public Gobbler(){
        center = new VictorSPX(7);
        ballcheck = new DigitalInput(7);
        directionswitch = true;
    }

    public void gobble(){
        if(joy.getRawButtonPressed(7) && directionswitch){
            directionswitch = false;
            //yeets the ball out
            if(ballcheck.get()){
                center.set(ControlMode.PercentOutput, 0.5);
            }
            //gobbles it in
            else{
                center.set(ControlMode.PercentOutput, -0.5);
            }
        }
        if(joy.getRawButtonReleased(7)){
            directionswitch = true;
        }
    }
}
