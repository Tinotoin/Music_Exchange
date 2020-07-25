package Shop;

import Instruments.Instrument;

import java.util.ArrayList;

public class Shop implements ISell{

    public String sell;
    private String name;
    private ArrayList<Instrument> items;
    private int cash;

    public Shop(String name, ArrayList<Instrument> items, int cash) {
        this.name = name;
        this.items = new ArrayList<Instrument>();
        this.cash = 1000;
    }

    public String getName() {
        return name;
    }

    public int getItems() {
        return items.size();
    }

    public String sell(String ISell) {
        return "Great sale!";
    }

    public int getCash() {
        return this.cash;
    }
}
