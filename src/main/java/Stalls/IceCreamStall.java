package Stalls;

import Interfaces.ITicketed;
import Visitors.Visitor;

public class IceCreamStall extends Stall implements ITicketed {
    private double defaultPrice;

    public IceCreamStall(String name, String ownerName, String parkingSpot) {
        super(name, ownerName, parkingSpot);
        this.defaultPrice = 2;
    }

    @Override
    public double defaultPrice() {
        return this.defaultPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return this.defaultPrice;
    }
}