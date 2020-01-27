package frc.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Wheels { 

    private TalonSRX intake;
    private TalonSRX largeWheel;
    private TalonSRX shooter;

    public Wheels(){
        intake = new TalonSRX(4);
        largeWheel = new TalonSRX(5);
        shooter = new TalonSRX(6);
    }
    //forward is from intake to shooters
    public void spinBigWheelFor(){
        largeWheel.set(ControlMode.PercentOutput, 0.1);
    }
    
    public void spinBigWheelBac(){
        largeWheel.set(ControlMode.PercentOutput, -0.1);
    }
    
    public void stopBigWheel(){
        largeWheel.stopMotor();
    }
    
    public void spinIntake(){
        intake.set(ControlMode.PercentOutput, 0.5);
    }
    
    public void stopIntake(){
        intake.stopMotor();
    }
    
    public void spinShooter(){
        shooter.set(ControlMode.PercentOutput, 0.1);
    } 
    
    public void stopShooter(){
        shooter.stopMotor();
    }
}
