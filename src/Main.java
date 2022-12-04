
public class Main {
    public static void main(String[] args) {
        //Simple cake:
        System.out.println("Simple cake: ");
        Dessert SimpleCake = new  Cake();
        System.out.println(SimpleCake.getIngredients());
        System.out.println(SimpleCake.getPrice());
        //Chocolate cake:
        System.out.println("Chocolate cake: ");
        Dessert ChocolateCake = new ChocolateCake(new Cake());
        System.out.println(ChocolateCake.getIngredients());
        System.out.println(ChocolateCake.getPrice());
        //Vanilla cake:
        System.out.println("Vanilla cake: ");
        Dessert VanillaCake = new VanillaCake(new Cake());
        System.out.println(VanillaCake.getIngredients());
        System.out.println(VanillaCake.getPrice());
        //Fruit cake:
        System.out.println("Fruit cake: ");
        Dessert FruitCake = new FruitCake(new Cake());
        System.out.println(FruitCake.getIngredients());
        System.out.println(FruitCake.getPrice());
        //Chocolate vanilla cake:
        System.out.println("Chocolate vanilla cake: ");
        Dessert ChocolateVanillaCake = new ChocolateCake(new VanillaCake(new Cake()));
        System.out.println(ChocolateVanillaCake.getIngredients());
        System.out.println(ChocolateVanillaCake.getPrice());
        //Chocolate fruit cake:
        System.out.println("Chocolate fruit cake: ");
        Dessert ChocolateFruitCake = new ChocolateCake(new FruitCake(new Cake()));
        System.out.println(ChocolateFruitCake.getIngredients());
        System.out.println(ChocolateFruitCake.getPrice());
        //Vanilla Fruit cake:
        System.out.println("Vanilla fruit cake: ");
        Dessert VanillaFruitCake = new VanillaCake(new FruitCake(new Cake()));
        System.out.println(VanillaFruitCake.getIngredients());
        System.out.println(VanillaCake.getPrice());
        //Chocolate vanilla fruit cake:
        System.out.println("Chocolate vanilla fruit cake: ");
        Dessert ChocolateVanillaFruitCake = new ChocolateCake(new VanillaCake(new FruitCake(new Cake())));
        System.out.println(ChocolateVanillaFruitCake.getIngredients());
        System.out.println(ChocolateVanillaFruitCake.getPrice());
    }
}