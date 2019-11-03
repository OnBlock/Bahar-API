package com.baharmc.api.command;

import com.baharmc.api.command.sent.CommandSent;
import org.jetbrains.annotations.NotNull;

public interface Executed {

    /**
     * Runs your executor
     *
     * @param commandSender sender of the command
     * @param args arguments which include objects
     * @return if it succeed
     */
    boolean run(@NotNull CommandSent commandSender, @NotNull Object... args);

}