public abstract class Dessert {

    double price;
    String ingredients;

    public double getPrice() {
        return price;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return ingredients + " , price: " + price;
    }
}
