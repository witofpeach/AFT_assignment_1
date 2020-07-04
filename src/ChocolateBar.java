public class ChocolateBar extends SweetBase {
    private final String name = "Аленка";
    private final double weight = 0.2;
    private final int price = 100;
    private final String uniqueParam = "Вкусный молочный шоколад";

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
