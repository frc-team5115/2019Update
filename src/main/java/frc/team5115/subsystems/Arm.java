package frc.team5115.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.SPI;

import static frc.team5115.robot.Robot.joy;

public class Arm {
    public TalonSRX arm;

    public Arm(){
        arm = new TalonSRX(0);
        arm.setInverted(false);
    }

    public void moveArm(){
        if(joy.getRawButton(14)){
            arm.set(ControlMode.PercentOutput, 0.35);

        }
        else if(joy.getRawButton(15)){
            arm.set(ControlMode.PercentOutput, -0.35);
        }
        else{
            arm.set(ControlMode.PercentOutput, 0);
        }
    }
}
