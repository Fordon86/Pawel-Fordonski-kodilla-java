package com.kodilla.patterns.bigmac.sauce;

public class Souce {
    public static final String STANDARD = "STANDARD";
    public static final String THOUSANDISLAND = "THOUSANDISLAND";
    public static final String BARBECUE = "BARBECUE";
    private static String souceKind;

    public Souce(String souceKind) {
        if (souceKind.equals(STANDARD) || souceKind.equals(THOUSANDISLAND) || souceKind.equals(BARBECUE)) {
            this.souceKind = souceKind;
        } else {
            throw new IllegalStateException ("There is not such a souce");
        }
    }
    public static String getSouceKind () {
        return souceKind;
    }
}
