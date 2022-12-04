package Cakes;

import Visitor.Visitor;

public class ApplePie implements Cakes {
    private int id;
    private int qty;
    private int baking;
    public ApplePie(int id, int qty, int y, int baking ) {
        this.id = id;
        this.qty = qty;
        this.baking = baking;

    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitApplePie(this);
    }

    @Override
    public void cook() {
        //
    }


    public int getId() {
        return id;
    }

    public int getQty() {
        return qty;
    }

    public int getBaking() {
        return baking;
    }


}
