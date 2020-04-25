package com.kodilla.patterns.bigmac.bun;

public class Bun {
    public static final String SESAME = "SESAME";
    public static final String WITHOUTSESAME = "WITHOUTSESAME";
    private static String kindOfBun;

    public Bun (String kindOfBun) {
        if (kindOfBun.equals(SESAME) || kindOfBun.equals(WITHOUTSESAME)) {
            this.kindOfBun = kindOfBun;
        } else {
            throw new IllegalStateException ("There is not such a bun");
        }
    }
    public static String getKindOfBun() {
        return kindOfBun;
    }
}
