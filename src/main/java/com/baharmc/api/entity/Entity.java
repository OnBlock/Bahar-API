package com.baharmc.api.entity;

import com.baharmc.api.command.CommandSource;
import com.baharmc.api.entity.context.LocationContext;
import com.baharmc.api.entity.context.Nameable;

import java.util.UUID;

public interface Entity extends Nameable, CommandSource, LocationContext {

    /**
     * Get entity's UUID
     *
     * @return Entity's UUID
     */
    UUID getUUID();
}
