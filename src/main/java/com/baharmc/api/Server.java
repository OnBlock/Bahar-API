package com.baharmc.api;

import com.baharmc.api.text.Texts;
import com.baharmc.api.text.TextComponent;
import org.jetbrains.annotations.NotNull;

public interface Server {

    /**
     * Sets the custom display brand
     * @apiNote - This method won't change anything in the server
     *            If you want to display this custom brand name
     *            instead of the default one, you have to send a
     *            custom payload (of type BRAND) to all the player
     *
     * @param brandName - custom text to set
     */
    void setDisplayBrandName(@NotNull String brandName);

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
    @NotNull
    String getVersion();

    /**
     * Gets the text manager to parse {@link String} to {@link TextComponent}
     * @return {@link Texts}
     */
    @NotNull
    Texts getTextManager();

}
