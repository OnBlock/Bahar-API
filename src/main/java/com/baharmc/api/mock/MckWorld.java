package com.baharmc.api.mock;

import com.baharmc.api.math.Vec3d;
import com.baharmc.api.world.Block;
import com.baharmc.api.world.World;
import org.jetbrains.annotations.NotNull;

public class MckWorld implements World {
    @Override
    public void setBlockAt(@NotNull Vec3d pos, @NotNull Blocks block) {
        throw new UnsupportedOperationException();
    }
    @NotNull
    @Override
    public Block getBlockAt(@NotNull Vec3d pos) {
        throw new UnsupportedOperationException();
    }
    @NotNull
    @Override
    public String getName() {
        throw new UnsupportedOperationException();
    }
}