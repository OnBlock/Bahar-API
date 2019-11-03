package com.baharmc.api;

import org.jetbrains.annotations.NotNull;

public interface Server {

    /**
     * Sets the custom display brand
     *
     * @param brandName - custom text to set
     */
    void setDisplayBrandName(String brandName);

    /**
     * Gets the custom display brand
     *
     * @return custom brand name
     */
    @NotNull
    String getDisplayBrandName();

    /**
     * Gets the default Server brand
     *
     * @return default Bahar brand name
     */
    @NotNull
    String getBrandName();

    /**
     * Gets the version of Bahar server
     *
     * @return version
     */
    String getVersion();

}
