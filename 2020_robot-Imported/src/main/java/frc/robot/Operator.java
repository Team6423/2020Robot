package frc.robot;

import frc.robot.Subsystems.*;

public class Operator { 

    private Controller OP;
    private Wheels wheels;
    public Operator(int port) {
        OP = new Controller(port);
        wheels = new Wheels();
        
    }
    public void opControls() {
        if (OP.getXButton()) {
            wheels.spinBigWheelFor();
        }
        else if (OP.getTriangleButton()) {
            wheels.spinBigWheelBac();
        }
        else {
            wheels.stopBigWheel();
        }
        
        if (OP.getOButton()) {
            wheels.spinIntake();
        }
        else {
            wheels.stopIntake();
        }
        
        if (OP.getSquareButton()) {
            wheels.spinShooter();
        }
        else {
            wheels.stopShooter();
        }
    }

}
