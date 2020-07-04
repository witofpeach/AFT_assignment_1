public class Candy extends SweetBase {
    private final String name = "Ласточка";
    private final double weight = 0.01;
    private final int price = 5;
    private final String uniqueParam = "Ласточка уже не та...";

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public String getUniqueParam() {
        return uniqueParam;
    }

    public String getInfo() {
        return "Название: " + name + "\n" + "Вес: " + weight + "кг.\n" + "Цена: " + price + "руб.\n"
                + "Описание: " + getUniqueParam() + "\n\n";
    }
}
