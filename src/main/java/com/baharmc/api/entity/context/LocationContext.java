package com.baharmc.api.entity.context;

import com.baharmc.api.entity.Entity;
import com.baharmc.api.math.Vec3d;
import com.baharmc.api.world.Location;

public interface LocationContext {

    /**
     * Gets the Location of this Entity
     *
     * @return current location of this Entity
     */
    Location getLocation();

    /**
     * Gets the Position of this Entity
     *
     * @return current position of this Entity as Vector
     */
    Vec3d getPos();

    /**
     * Teleports this Entity to a Location
     *
     * @param loc the Location to teleport this Entity to
     */
    void teleport(Location loc);

    /**
     * Teleports this Entity to another Entity
     *
     * @param entity the Entity to teleport this Entity to
     */
    void teleport(Entity entity);

    /**
     * Teleports this Entity to a Vector Location in the current World
     *
     * @param vec the vector position to teleport this Entity to
     */
    void teleport(Vec3d vec);

    /**
     * Teleports this Entity to a coordinates in the current World
     *
     * @param x coordinate in the X Axis
     * @param y coordinate in the Y Axis
     * @param z coordinate in the Z Axis
     */
    void teleport(double x, double y, double z);

}
