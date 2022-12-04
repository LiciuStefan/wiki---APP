package Visitor;

import Cakes.CompoundCakes;
import Cakes.Brownie;
import Cakes.ApplePie;

public interface Visitor {
    String visitBrownie(Brownie brownie);
    String visitApplePie(ApplePie applePie);
    String visitCompoundCakes(CompoundCakes cc);
}
