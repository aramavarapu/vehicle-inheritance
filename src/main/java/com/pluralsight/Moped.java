package com.pluralsight;

public class Moped extends Vehicle{
    private boolean hasKickstand;
    private boolean hasPedals;

    public boolean isHasKickstand() {
        return hasKickstand;
    }

    public void setHasKickstand(boolean hasKickstand) {
        this.hasKickstand = hasKickstand;
    }

    public boolean isHasPedals() {
        return hasPedals;
    }

    public void setHasPedals(boolean hasPedals) {
        this.hasPedals = hasPedals;
    }
}
