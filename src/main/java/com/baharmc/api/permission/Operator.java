package com.baharmc.api.permission;

import com.baharmc.api.Bahar;

public interface Operator {

    /**
     * Sets whether or not the permissible is an operator,
     * or otherwise holds all permissions.
     *
     * @param op {@code true} to set to an operator,
     * {@code false} to set to a non-operator.
     */
    default void setOp(boolean op) {
        Bahar.getPermissionService().setOp(this, op);
    }

    /**
     * Checks to see whether or not this permissible object
     * is set to an operator of the server.
     *
     * @return {@code true} if this permissible object is an
     * operator, {@code false} if it is not
     */
    default boolean isOp() {
        return Bahar.getPermissionService().isOp(this);
    }

}