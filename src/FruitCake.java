public class FruitCake extends DecoratorIngredients{

    public  FruitCake(Dessert D)
    {
        this.dessert = D;
    }

    @Override
    public String getIngredients()
    {
        return this.dessert.getIngredients() + ", fruits";
    }

    @Override
    public double getPrice()
    {
        return this.dessert.getPrice() + 1.50;
    }
}
