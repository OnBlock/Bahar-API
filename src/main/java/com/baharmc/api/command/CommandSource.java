package com.baharmc.api.command;

import com.baharmc.api.entity.Player;
import com.baharmc.api.mock.MckPlayer;
import org.jetbrains.annotations.NotNull;

/**
 * This is the source of a command
 */
public interface CommandSource {

    /**
     * Gets a text argument
     *
     * @return Argument value
     */
    @NotNull
    String getArgText();

    /**
     * Gets a player argument
     *
     * If it's null returns {@link MckPlayer}
     * @return Player
     */
    @NotNull
    Player getArgPlayer();

    /**
     * Gets a text argument
     *
     * @param commandId is command/sub-command id
     * @return Argument value
     */
    @NotNull
    String getArgText(@NotNull String commandId);

    /**
     * Gets a player argument
     *
     * If it's null returns {@link MckPlayer}
     *
     * @param commandId is command/sub-command id
     * @return Player
     */
    @NotNull
    Player getArgPlayer(@NotNull String commandId);

    /**
     * Gets sender of the command
     *
     * @return {@link CommandSended}
     */
    @NotNull
    CommandSended getCommandSender();

}