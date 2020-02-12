package com.baharmc.api.entity.context;

import com.baharmc.api.world.World;

public interface WorldContext {

    /**
     * Gets the World of this Entity
     *
     * @return current World of this Entity
     */
    World getWorld();

}
