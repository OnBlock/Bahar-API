package com.baharmc.api.math;

import org.jetbrains.annotations.NotNull;

/**
 * net.minecraft.util.math.Vec3d
 */
public class Vec3d {

    public static final Vec3d ZERO = new Vec3d(0.0D, 0.0D, 0.0D);

    public final double x;

    public final double y;

    public final double z;

    public Vec3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @NotNull
    public static Vec3d fromPolar(float from, float to) {
        final float cos = -MathHelper.cos(-from * 0.017453292F);

        return new Vec3d(
            MathHelper.sin(-to * 0.017453292F - 3.1415927F) * cos,
            MathHelper.sin(-from * 0.017453292F),
            MathHelper.cos(-to * 0.017453292F - 3.1415927F) * cos
        );
    }

    @NotNull
    public Vec3d reverseSubtract(@NotNull Vec3d vec3d) {
        return new Vec3d(vec3d.x - x, vec3d.y - y, vec3d.z - z);
    }

    @NotNull
    public Vec3d normalize() {
        final double double_1 =  MathHelper.sqrt(x * x + y * y + z * z);

        return double_1 < 1.0E-4D ? ZERO : new Vec3d(x / double_1, y / double_1, z / double_1);
    }

    public double dotProduct(@NotNull Vec3d vec3d) {
        return x * vec3d.x + y * vec3d.y + z * vec3d.z;
    }

    @NotNull
    public Vec3d crossProduct(@NotNull Vec3d vec3d) {
        return new Vec3d(y * vec3d.z - z * vec3d.y, z * vec3d.x - x * vec3d.z, x * vec3d.y - y * vec3d.x);
    }

    @NotNull
    public Vec3d subtract(@NotNull Vec3d vec3d) {
        return subtract(vec3d.x, vec3d.y, vec3d.z);
    }

    @NotNull
    public Vec3d subtract(double x, double y, double z) {
        return add(-x, -y, -z);
    }

    @NotNull
    public Vec3d add(Vec3d vec3d) {
        return add(vec3d.x, vec3d.y, vec3d.z);
    }

    @NotNull
    public Vec3d add(double x, double y, double z) {
        return new Vec3d(this.x + x, this.y + y, this.z + z);
    }

    public double distanceTo(@NotNull Vec3d vec3d) {
        final double double_1 = vec3d.x - x;
        final double double_2 = vec3d.y - y;
        final double double_3 = vec3d.z - z;

        return MathHelper.sqrt(double_1 * double_1 + double_2 * double_2 + double_3 * double_3);
    }

    public double squaredDistanceTo(@NotNull Vec3d vec3d) {
        final double double_1 = vec3d.x - x;
        final double double_2 = vec3d.y - y;
        final double double_3 = vec3d.z - z;

        return double_1 * double_1 + double_2 * double_2 + double_3 * double_3;
    }

    public double squaredDistanceTo(double x, double y, double z) {
        final double double_4 = x - this.x;
        final double double_5 = y - this.y;
        final double double_6 = z - this.z;

        return double_4 * double_4 + double_5 * double_5 + double_6 * double_6;
    }

    @NotNull
    public Vec3d multiply(double multiplier) {
        return multiply(multiplier, multiplier, multiplier);
    }

    @NotNull
    public Vec3d negate() {
        return multiply(-1.0D);
    }

    @NotNull
    public Vec3d multiply(@NotNull Vec3d vec3d) {
        return this.multiply(vec3d.x, vec3d.y, vec3d.z);
    }

    public Vec3d multiply(double x, double y, double z) {
        return new Vec3d(this.x * x, this.y * y, this.z * z);
    }

    public double length() {
        return MathHelper.sqrt(x * x + y * y + z * z);
    }

    public double lengthSquared() {
        return x * x + y * y + z * z;
    }

    public boolean equals(Object object_1) {
        if (this == object_1) {
            return true;
        } else if (!(object_1 instanceof Vec3d)) {
            return false;
        } else {
            final Vec3d vec3d = (Vec3d) object_1;

            return Double.compare(vec3d.x, x) == 0 &&
                Double.compare(vec3d.y, y) == 0 &&
                Double.compare(vec3d.z, z) == 0;
        }
    }

    public int hashCode() {
        long long_1 = Double.doubleToLongBits(this.x);
        int int_1 = (int) (long_1 ^ long_1 >>> 32);
        long_1 = Double.doubleToLongBits(this.y);
        int_1 = 31 * int_1 + (int) (long_1 ^ long_1 >>> 32);
        long_1 = Double.doubleToLongBits(this.z);
        int_1 = 31 * int_1 + (int) (long_1 ^ long_1 >>> 32);

        return int_1;
    }

    @NotNull
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    @NotNull
    public Vec3d rotateX(float x) {
        final float float_2 = MathHelper.cos(x);
        final float float_3 = MathHelper.sin(x);
        final double double_1 = this.x;
        final double double_2 = y * (double) float_2 + z * (double) float_3;
        final double double_3 = z * (double) float_2 - y * (double) float_3;

        return new Vec3d(double_1, double_2, double_3);
    }

    @NotNull
    public Vec3d rotateY(float y) {
        final float float_2 = MathHelper.cos(y);
        final float float_3 = MathHelper.sin(y);
        final double double_1 = x * (double) float_2 + z * (double) float_3;
        final double double_2 = this.y;
        final double double_3 = z * (double) float_2 - x * (double) float_3;

        return new Vec3d(double_1, double_2, double_3);
    }

    public final double getX() {
        return x;
    }

    public final double getY() {
        return y;
    }

    public final double getZ() {
        return z;
    }

}