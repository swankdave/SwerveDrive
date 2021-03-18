package com.swervedrivespecialties.exampleswerve;

public class RobotMap {
    public static final double TRACKWIDTH = 30;
    public static final double WHEELBASE = 30;

    public static final double FRONT_LEFT_ANGLE_OFFSET = -Math.toRadians(45);
    public static final double FRONT_RIGHT_ANGLE_OFFSET = -Math.toRadians(135);
    public static final double BACK_LEFT_ANGLE_OFFSET = -Math.toRadians(225);
    public static final double BACK_RIGHT_ANGLE_OFFSET = -Math.toRadians(315);

    public static final int DRIVETRAIN_FRONT_LEFT_ANGLE_MOTOR = 27; // CAN
    public static final int DRIVETRAIN_FRONT_LEFT_ANGLE_ENCODER = 33; // Analog
    public static final int DRIVETRAIN_FRONT_LEFT_DRIVE_MOTOR = 26; // CAN

    public static final int DRIVETRAIN_FRONT_RIGHT_ANGLE_MOTOR = 21; // CAN
    public static final int DRIVETRAIN_FRONT_RIGHT_ANGLE_ENCODER = 30; // Analog
    public static final int DRIVETRAIN_FRONT_RIGHT_DRIVE_MOTOR = 20; // CAN

    public static final int DRIVETRAIN_BACK_LEFT_ANGLE_MOTOR = 25; // CAN
    public static final int DRIVETRAIN_BACK_LEFT_ANGLE_ENCODER = 32; // Analog
    public static final int DRIVETRAIN_BACK_LEFT_DRIVE_MOTOR = 24; // CAN

    public static final int DRIVETRAIN_BACK_RIGHT_ANGLE_MOTOR = 23; // CAN
    public static final int DRIVETRAIN_BACK_RIGHT_ANGLE_ENCODER = 31; // Analog
    public static final int DRIVETRAIN_BACK_RIGHT_DRIVE_MOTOR = 22; // CAN
}
