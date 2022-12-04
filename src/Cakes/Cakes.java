package Cakes;

import Visitor.Visitor;

public interface Cakes {
    void cook();
    String accept(Visitor visitor);

}
