package com.company;

public enum Countrys {
    ROHAN("Рохан", true),
    GONDOR("Гондор", true),
    MORDOR("Мордор", false);

    private final String ruName;
    private final boolean isOpen;


    Countrys(final String ruName, final boolean isOpen) {
        this.ruName = ruName;
        this.isOpen = isOpen;
    }

    public boolean isOpen() {
        return isOpen;
    }

    @Override
    public String toString() {
        return name() + "(" + ruName + ")";
    }

    public static void getByRuName(final String ru) {
        for (int i = 0; i < Countrys.values().length; i++) {


            return;
        }

    }
}


