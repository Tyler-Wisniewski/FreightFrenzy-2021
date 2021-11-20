package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Carousel {


    private DcMotor carouselMotor; //Port

    public void init(HardwareMap hardwareMap) {

        carouselMotor = hardwareMap.get(DcMotor.class, "carouselMotor");

        carouselMotor.setPower(0);
    }

    //[button]: rotate counterclockwise
    public void rotate(boolean button, double power) {
        if (button) {
            carouselMotor.setPower(-.5);
        } else {
            carouselMotor.setPower(0);
        }
       /* if (button2) {
            carouselMotor.setPower(-.5);
        } else {
            carouselMotor.setPower(0);
        }*/
    }


    public DcMotor getCarouselMotor() {
        return carouselMotor;
    }
}
