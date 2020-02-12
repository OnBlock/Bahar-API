package com.baharmc.api.world;

import com.baharmc.api.math.Vec3d;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a block in the world
 */
public interface Block {

    /**
     * Gets the block's coordinates
     *
     * @return the block's coordinates
     */
    @NotNull
    Location getLocation();

    /**
     * Gets the block's world
     *
     * @return the block's world
     */
    @NotNull
    World getWorld();

}