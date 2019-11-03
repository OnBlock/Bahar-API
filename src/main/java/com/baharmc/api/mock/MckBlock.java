package com.baharmc.api.mock;

import com.baharmc.api.math.Vec3d;
import com.baharmc.api.world.Block;
import com.baharmc.api.world.World;
import org.jetbrains.annotations.NotNull;

public final class MckBlock implements Block {
    @NotNull
    @Override
    public Vec3d getLocation() {
        throw new UnsupportedOperationException();
    }
    @NotNull
    @Override
    public World getWorld() {
        throw new UnsupportedOperationException();
    }
}