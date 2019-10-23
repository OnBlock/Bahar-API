package com.baharmc.api;

public final class Bahar {

    private static Server server;

    /**
     * Get the global server instance
     *
     * @return The server instance
     */
    public static Server getServer() {
        if (server == null)
            throw new RuntimeException("Server isn't set!");

        return server;
    }

    /**
     * Sets the global server instance
     * <b>Should not be used by plugins!</b>
     *
     * @param server Server instance
     */
    public static void setServer(Server server) {
        if (Bahar.server != null)
            throw new RuntimeException("Server is already set!");

        Bahar.server = server;
    }

}
