package com.baharmc.api;

import com.baharmc.api.mock.MckServer;
import com.baharmc.api.permission.PermissionService;
import org.jetbrains.annotations.NotNull;

import java.util.ServiceLoader;

public final class Bahar {

    /**
     * Private ctor.
     */
    private Bahar() {
    }

    /**
     * Permission service loader
     */
    private static final ServiceLoader<PermissionService> permissionServiceLoader =
        ServiceLoader.load(PermissionService.class);

    /**
     * Server instance.
     */
    @NotNull
    private static Server server = new MckServer();

    /**
     * Get the global server instance
     *
     * @return The server instance
     * @throws RuntimeException if {@link #server} is not set.
     */
    @NotNull
    public static Server getServer() {
        if (server instanceof MckServer) {
            throw new RuntimeException("Server isn't set!");
        }

        return server;
    }

    /**
     * Sets the global server instance
     * <b>Should not be used by plugins!</b>
     *
     * @param server Server instance
     * @throws RuntimeException if {@link #server} is already set.
     */
    public static void setServer(@NotNull Server server) {
        if (!(Bahar.server instanceof MckServer)) {
            throw new RuntimeException("Server is already set!");
        }

        Bahar.server = server;
    }

    /**
     * Get the current permission service
     *
     * @return The current permission service
     * @throws RuntimeException there is not permission service.
     */
    @NotNull
    public static PermissionService getPermissionService() {
        final PermissionService service = permissionServiceLoader.iterator().next();

        if (service == null) {
            throw new RuntimeException("No permissions service found! Get a permission manager plugin for Bahar!");
        }

        return service;
    }

}
