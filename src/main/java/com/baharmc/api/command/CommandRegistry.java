package com.baharmc.api.command;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Registers the commands
 */
public interface CommandRegistry {

    /**
     * Register command
     *
     * @param cmd {@link Command}
     */
    void register(@NotNull Command cmd);

    /**
     * Unregister command
     *
     * @param cmd {@link Command}
     */
    void unregister(@NotNull Command cmd);

    /**
     * Gets the command
     *
     * @param commandLabel is command label of the commad
     * @return {@link Command}
     */
    @NotNull
    Command getCommand(@NotNull String commandLabel);

    /**
     * Gets all commands in the server
     *
     * @return {@link List<Command>}
     */
    @NotNull
    List<Command> getCommands();

}
