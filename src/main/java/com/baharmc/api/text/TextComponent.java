package com.baharmc.api.text;

public interface TextComponent extends MessageComponent {

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
