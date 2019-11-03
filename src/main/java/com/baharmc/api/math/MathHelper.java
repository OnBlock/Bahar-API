package com.baharmc.api.math;

/**
 * Some helper math objects, mostly for use in {@link Vec3d}
 */
public final class MathHelper {

    private MathHelper() {
    }

    public static float sin(float value) {
        return (float) Math.sin(value);
    }

    public static float cos(float value) {
        return (float) Math.cos(value);
    }

    public static float sqrt(double value) {
        return (float) Math.sqrt(value);
    }

}