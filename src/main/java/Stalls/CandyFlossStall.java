package Stalls;

import Interfaces.ITicketed;
import Visitors.Visitor;

public class CandyFlossStall extends Stall implements ITicketed {
    private double defaultPrice;
    public CandyFlossStall(String name, String ownerName, String parkingSpot) {
        super(name, ownerName, parkingSpot);
        this.defaultPrice = 4;
    }

    @Override
    public double defaultPrice() {
        return defaultPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return defaultPrice;
    }
}
