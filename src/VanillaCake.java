public class VanillaCake extends DecoratorIngredients{

    public  VanillaCake(Dessert D)
    {
        this.dessert = D;
    }

    @Override
    public String getIngredients()
    {
        return this.dessert.getIngredients() + ", vanilla";
    }

    @Override
    public double getPrice()
    {
        return this.dessert.getPrice() + 3.30;
    }
}
