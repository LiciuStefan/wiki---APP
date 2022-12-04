public class ChocolateCake extends DecoratorIngredients {
    public ChocolateCake(Dessert D)
    {
        this.dessert = D;
    }

    @Override
    public String getIngredients() {
        return this.dessert.getIngredients() + ", chocolate";
    }

    @Override
    public double getPrice() {
        return this.dessert.getPrice() + 3.30;
    }
}
