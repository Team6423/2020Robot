package frc.robot.Subsystems;  

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;


public class Drivetrain {

    private TalonSRX leftFront;
    private TalonSRX leftBack;
    private TalonSRX rightFront;
    private TalonSRX rightBack;


    public Drivetrain() {
        leftFront = new TalonSRX(0);
        leftBack = new TalonSRX(1);
        rightFront = new TalonSRX(2);
        rightBack = new TalonSRX(3);

        leftBack.follow(leftFront);
        rightBack.follow(rightFront);

    }

    public void arcadeDrive(double straight, double left, double right) { 
        leftFront.set(ControlMode.PercentOutput, + left - right);
        rightFront.set(ControlMode.PercentOutput, -(straight - left + right)); 
    }

    public void drive(double speed){
        leftFront.set(ControlMode.PercentOutput, speed);
        rightFront.set(ControlMode.PercentOutput, speed);
    }

    public void tankDrive(double lspeed, double rspeed){
        leftFront.set(ControlMode.PercentOutput, lspeed);
        rightFront.set(ControlMode.PercentOutput, rspeed);
    }
}