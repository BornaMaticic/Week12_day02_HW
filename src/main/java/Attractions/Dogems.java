package Attractions;

import Interfaces.ITicketed;
import Visitors.Visitor;

public class Dogems extends Attraction implements ITicketed {
    private double defaultPrice;
    public Dogems(String name) {
        super(name);
        defaultPrice = 4;
    }


    @Override
    public double defaultPrice() {
        return this.defaultPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12){
            return this.defaultPrice/2;
        }
        return this.defaultPrice;
    }
}
