package Instruments;

import Shop.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String instrument;
    private String family;
    private boolean acoustic;
    private String colour;
    private int price;

    public Instrument(String instrument, String family, boolean acoustic, String colour, int price) {
        this.instrument = instrument;
        this.family = family;
        this.acoustic = acoustic;
        this.colour = colour;
        this.price = price;
    }

    public String getInstrument() {
        return instrument;
    }

    public String getFamily() {
        return family;
    }

    public boolean isAcoustic() {
        return acoustic;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }

//    public int sell(int sell) {
//        return getPrice();
//    }

    public int setPrice(int price) {
        this.price = price;
        return this.price;
    }
}

