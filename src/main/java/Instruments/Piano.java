package Instruments;

import Shop.ISell;

public class Piano extends Instrument implements IPlay, ISell {

    private boolean upright;

    public Piano(String instrument, String family, boolean acoustic, String colour, int price, boolean upright) {
        super(instrument, family, acoustic, colour, price);
        this.upright = true;
    }

    public boolean isUpright() {
        return upright;
    }

    public String play(String play){
        return "Wow, tickle those ivories!";
    }

    public String sell(String sell) {
        return "Great sale!";
    }
}
