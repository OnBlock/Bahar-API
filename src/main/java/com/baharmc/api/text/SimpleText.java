package com.baharmc.api.text;

import net.minecraft.text.LiteralText;

public interface SimpleText {

    /**
     * A Simple way of managing the Texts
     *
     * @param string - the String you want to make a text out of
     * @return an instance of SimpleText
     */
    SimpleText of(String string);

    /**
     * Another Simple way of managing the Texts
     *
     * @param text - the LiteralText instance you want to make a text out of
     * @return an instance of SimpleText
     */
    SimpleText of(LiteralText text);

    /**
     * Translates the alternate color codes into the special character
     *
     * @see TextFormat
     * @param altChar - character to translate
     */
    void translateAlternateColorChar(char altChar);

    /**
     * Allow Formatting codes
     *
     * @param allow - if its not allowed, then you can't use color co
     */
    void allowFormattingCodes(boolean allow);

    /**
     * Gets the raw string
     *
     * @return raw string
     */
    String getRawString();

    /**
     * Gets the formatted string
     *
     * @return translated formatted string
     */
    String getFormattedString();

    /**
     * Gets the raw string without the formatting codes
     *
     * @return translated raw string
     */
    String getWithoutFormattingCodes();
}
