package com.baharmc.api.mock;

import com.baharmc.api.Server;
import org.jetbrains.annotations.NotNull;

public final class MckServer implements Server {
    @Override
    public void setDisplayBrandName(@NotNull String brandName) {
        throw new UnsupportedOperationException();
    }
    @NotNull
    @Override
    public String getDisplayBrandName() {
        throw new UnsupportedOperationException();
    }
    @NotNull
    @Override
    public String getBrandName() {
        throw new UnsupportedOperationException();
    }
    @NotNull
    @Override
    public String getVersion() {
        throw new UnsupportedOperationException();
    }
}
