package frc.robot;

import frc.robot.Subsystems.*;

public class Operator { 

    private Controller OP;
    private Wheels wheels;
    public Operator(int port){
        OP = new Controller(port);
        wheels = new Wheels();
        
    }
    public void opControls(){
        if(OP.getXButton()){
            wheels.spinBigWheelFor();
        }
        if(OP.getOButton()){
            wheels.spinIntake();
        }
        if(OP.getSquareButton()){
            wheels.spinShooter();
        }
    }

}