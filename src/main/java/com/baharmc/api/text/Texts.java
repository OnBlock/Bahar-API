package com.baharmc.api.text;

import org.jetbrains.annotations.NotNull;

public interface Texts {

    @NotNull
    TextComponent toTextComponent(@NotNull String text);

    @NotNull
    TextComponent toTextComponent(@NotNull MessageComponent messageComponent);

}
