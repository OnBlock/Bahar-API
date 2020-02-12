package com.baharmc.api.entity.context;

import org.jetbrains.annotations.Nullable;

public interface Nameable {
    /**
     * Gets the original name of the Entity
     *
     * @return name of the Entity
     */
    String getName();

    /**
     * Gets the Custom Name of the Entity
     * This doesn't have any effects on a Player
     *
     * @return Custom Name OR {@code null} if Empty
     */
    @Nullable
    String getCustomName();

    /**
     * Sets the Custom name of the Entity
     * This doesn't have any effects on a Player
     * <p>
     *     Set this to {@code null} Or an Empty String to clear it
     * </p>
     *
     * @param name the new Custom Name
     */
    void setCustomName(@Nullable String name);
}
