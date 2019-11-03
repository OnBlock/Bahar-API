package com.baharmc.api.plugin;

public interface Plugin {

    /**
     * Runs when the plugin was loaded
     */
    void load();

    /**
     * Runs when the plugin was enabled
     */
    void enable();

    /**
     * Runs when the plugin was disabled
     */
    void disable();

}
