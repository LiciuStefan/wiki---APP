package Cakes;

import Visitor.Visitor;
import java.util.ArrayList;
import java.util.List;

public class CompoundCakes implements Cakes {
    public int id;
    public List<Cakes> children = new ArrayList<>();

    public CompoundCakes(int id) {
        this.id = id;
    }

    @Override
    public void cook() {
        //
    }

    public int getId() {
        return id;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundCakes(this);
    }

    public void add(Cakes cakes) {
        children.add(cakes);
    }
}
