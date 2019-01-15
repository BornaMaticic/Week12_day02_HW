package Stalls;

import Interfaces.ISecurity;
import Interfaces.ITicketed;
import Visitors.Visitor;

public class TobacoStall extends Stall implements ISecurity, ITicketed {
    private double defaultPrice;
    public TobacoStall(String name, String ownerName, String parkingSpot) {

        super(name, ownerName, parkingSpot);
        this.defaultPrice = 6;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge()>=18){
            return true;
        }
        return false;
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
