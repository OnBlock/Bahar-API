package com.baharmc.api.command;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface CommandRegistry {

    // TODO: 03/11/2019 javadoc
    void registerCommand(@NotNull Command command);

    // TODO: 03/11/2019 javadoc
    void unregisterCommand(@NotNull Command command);

    // TODO: 03/11/2019 javadoc
    void unregisterCommand(@NotNull String commandLabel);

    // TODO: 03/11/2019 javadoc
    @NotNull
    Command getCommand(@NotNull String commandLabel);

    // TODO: 03/11/2019 javadoc
    @NotNull
    List<Command> getCommands();

}
