package Instruments;

import Instruments.IPlay;
import Shop.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private int strings;
    private int price;

    public Guitar(String instrument, String family, boolean acoustic, String colour, int price) {
        super(instrument, family, acoustic, colour, price);
        this.strings = 6;
        this.price = 200;

    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    public String play(String play) {
        return "Wow, what a groovy sound!";
    }

    public int getPrice(){
        return this.price;
    }

    public String sell(String sell) {
        return "Great sale!";
    }
}
