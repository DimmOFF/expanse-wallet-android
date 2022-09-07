package com.alphawallet.app.entity;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class KnownContract {

    @SerializedName("MainNet")
    @Expose
    private final List<UnknownToken> mainNet = null;

    @SerializedName("xDAI")
    @Expose
    private final List<UnknownToken> xDAI = null;

    @SerializedName("Expanse")
    @Expose
    private final List<UnknownToken> expanse = null;

    public List<UnknownToken> getMainNet() {
        return mainNet;
    }

    public List<UnknownToken> getXDAI() {
        return xDAI;
    }

    public List<UnknownToken> getExpanse() {
        return expanse;
    }
}