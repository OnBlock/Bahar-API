package com.baharmc.api.world;

import com.baharmc.api.math.Vec3d;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.dimension.DimensionType;

public interface Location {
    /**
     * Gets the Position of the Location at an Axis
     * @return the coordinates of the location in the X Axis
     */
    double getX();

    /**
     * Gets the Position of the Location at an Axis
     * @return the coordinates of the location in the Y Axis
     */
    double getY();

    /**
     * Gets the Position of the Location at an Axis
     * @return the coordinates of the location in the Z Axis
     */
    double getZ();

    /**
     * Gets the Yaw of this Location
     *
     * A yaw of 0 or 360 represents the positive z direction.
     * A yaw of 180 represents the negative z direction.
     * A yaw of 90 represents the negative x direction.
     * A yaw of 270 represents the positive x direction.
     *
     * @return the rotation's yaw
     */
    float getYaw();

    /**
     * Gets the Pitch of this Location
     *
     * A pitch of 0 represents level forward facing.
     * A pitch of 90 represents downward facing, or negative y direction.
     * A pitch of -90 represents upward facing, or positive y direction.
     *
     * @return the rotation's pitch
     */
    float getPitch();

    /**
     * Gets the Identifier of the Dimension this location exists in
     *
     * @return dimension identifier
     */
    Identifier getDimension();

    /**
     * Gets the {@link DimensionType} this location exists in
     *
     * @return type of the dimension
     */
    DimensionType getDimensionType();

    /**
     * Gets the {@link World} this location exists in
     *
     * @return world
     */
    World getWorld();

    /**
     * Gets the Location as a {@link BlockPos}
     *
     * @return a BlockPos
     */
    BlockPos toPos();

    /**
     * Gets the Location as a {@link ChunkPos}
     *
     * @return a ChunkPos
     */
    //ChunkPos toChunkPos();

    /**
     * Gets the Location as a {@link Vec3d}
     *
     * @return a Vec3d
     */
    Vec3d toVec3d();

    /**
     * Gets the Location as a {@link Vec3i}
     *
     * @return a Vec3i
     */

    /**
     * Sets the Position of the Location at the X Axis
     * @param x the coordinates of the location in the X Axis
     */
    void setX(double x);

    /**
     * Sets the Position of the Location at the Y Axis
     * @param y the coordinates of the location in the Y Axis
     */
    void setY(double y);

    /**
     * Sets the Position of the Location at the Z Axis
     * @param z the coordinates of the location in the Z Axis
     */
    void setZ(double z);

    /**
     * Sets the dimension this location exists in
     * @param id Identifier of the dimension
     */
    void setDimension(Identifier id);

    /**
     * Sets the Yaw of this location
     *
     * A yaw of 0 or 360 represents the positive z direction.
     * A yaw of 180 represents the negative z direction.
     * A yaw of 90 represents the negative x direction.
     * A yaw of 270 represents the positive x direction.
     *
     * @param yaw the new yaw
     */
    void setYaw(float yaw);

    /**
     * Sets the Pitch of this location
     *
     * A pitch of 0 represents level forward facing.
     * A pitch of 90 represents downward facing, or negative y direction.
     * A pitch of -90 represents upward facing, or positive y direction.
     *
     * @param pitch the new pitch
     */
    void setPitch(float pitch);

}
