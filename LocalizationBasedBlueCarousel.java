package org.firstinspires.ftc.teamcode.autonomous;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.teamcode.subsystems.Carousel;


import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

@Autonomous(name = "BlueCarouselAuto", group = "Blue")
public class LocalizationBasedBlueCarousel extends LinearOpMode {

    Carousel carousel = new Carousel();


    @Override
    public void runOpMode() {
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);

        Trajectory myTrajectory = drive.trajectoryBuilder(new Pose2d())
                .strafeRight(10)
                .build();

        Trajectory myTrajectory2 = drive.trajectoryBuilder(myTrajectory.end())
                .back(5)
                .build();

        waitForStart();

        if(isStopRequested()) return;

        drive.followTrajectory(myTrajectory);
        carousel.rotate(true, -.5);
        sleep(1000);
        carousel.rotate(true, 0);
        drive.followTrajectory(myTrajectory2);


    }


}
