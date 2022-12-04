package Visitor;

import Cakes.*;

public class XMLExportVisitor implements Visitor{
    public String export(Cakes... args) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
        for (Cakes cakes : args) {
            sb.append(cakes.accept(this)).append("\n");
        }
        return sb.toString();
    }

    public String visitBrownie(Brownie b) {
        return "<brownie>" + "\n" +
                "    <id>" + b.getId() + "</id>" + "\n" +
                "    <qty>" + b.getQty() + "</qty>" + "\n" +
                "    <baking>" + b.getBaking() + "</baking>" + "\n" +
                "</brownie>";
    }

    public String visitApplePie(ApplePie a) {
        return "<applePie>" + "\n" +
                "    <id>" + a.getId() + "</id>" + "\n" +
                "    <qty>" + a.getQty() + "</qty>" + "\n" +
                "    <baking>" + a.getBaking() + "</baking>" + "\n" +
                "</applePie>";
    }



    public String visitCompoundCakes(CompoundCakes cc) {
        return "<compound_cakes>" + "\n" +
                "   <id>" + cc.getId() + "</id>" + "\n" +
                _visitCompoundCakes(cc) +
                "</compound_cakes>";
    }

    private String _visitCompoundCakes(CompoundCakes cc) {
        StringBuilder sb = new StringBuilder();
        for (Cakes cakes : cc.children) {
            String obj = cakes.accept(this);

            obj = "    " + obj.replace("\n", "\n    ") + "\n";
            sb.append(obj);
        }
        return sb.toString();
    }
}
