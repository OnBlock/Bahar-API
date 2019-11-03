package com.baharmc.api.command;

import com.baharmc.api.world.Block;
import org.jetbrains.annotations.NotNull;

public interface BlockCommandSended extends CommandSended {

    /**
     * Returns the block this command sender belongs to
     *
     * @return Block for the command sender
     */
    @NotNull
    Block getBlock();

}