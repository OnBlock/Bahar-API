package com.baharmc.api.command;

import org.jetbrains.annotations.NotNull;

public interface ProxiedCommandSent extends CommandSent {

    /**
     * Returns the CommandSender which triggered this proxied command
     *
     * @return the caller which triggered the command
     */
    @NotNull
    CommandSent getCaller();

    /**
     * Returns the CommandSender which is being used to call the command
     *
     * @return the caller which the command is being run as
     */
    @NotNull
    CommandSent getCallee();

}