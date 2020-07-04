public class Cupcake extends SweetBase {
    private final String name = "Капкейк";
    private final double weight = 0.3;
    private final int price = 200;
    private final String uniqueParam = "Пирожное небольшого размера";

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
                + "Описание: " + getUniqueParam() + "\n";
    }
}
