// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

import org.junit.Test;

/** Add your docs here. */
public class AngleTest {

    @Test
    public void t1() {
        normalizeAngle(-270 - 360);
        normalizeAngle(-270);
        normalizeAngle(90);
        normalizeAngle(90 + 360);
    }

    void normalizeAngle(double in_angle) {
        double angle = in_angle;
        angle %= 360;
        if (angle < 0.0)
        {
          angle += 360;
        }
        System.out.println (in_angle + " -> " + angle);
    }
}
