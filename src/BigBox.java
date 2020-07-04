import java.util.ArrayList;

public class BigBox implements IBox {

    private ArrayList<SweetBase> sweetArray = new ArrayList<>();

    public BigBox() {
        sweetArray.add(new Candy());
        sweetArray.add(new ChocolateBar());
        sweetArray.add(new ChocolateBar());
        sweetArray.add(new Cupcake());
        sweetArray.add(new Cupcake());
        sweetArray.add(new Cupcake());
    }

    @Override
    public void add(SweetBase sweet) {
        sweetArray.add(sweet);
    }

    @Override
    public void delete(int index) {
        sweetArray.remove(index);
    }

    @Override
    public double getWeight() {
        double weight = 0;
        for (SweetBase sweet : sweetArray) {
            weight += sweet.getWeight();
        }

        return weight;
    }

    @Override
    public int getPrice() {
        int price = 0;
        for (SweetBase sweet : sweetArray) {
            price += sweet.getPrice();
        }

        return price;
    }

    @Override
    public void printInfo() {
        System.out.printf("%.2f кг.\n", getWeight());
        System.out.println(getPrice() + " руб.");
        System.out.println(" ----------------- ");

        for (SweetBase sweet : sweetArray) {
            System.out.println(sweet.getInfo());
        }
        System.out.println(" ----------------- \n");
    }

    @Override
    public void reduceWeight(double weight) {
        while (getWeight() > weight) {
            delete(minWeightIndex(sweetArray));
        }

        System.out.println("Снижение веса - успешно");
        System.out.println(" ----------------- ");
    }

    @Override
    public void reducePrice(int price) {
        while (getPrice() > price) {
            delete(minPriceIndex(sweetArray));
        }

        System.out.println("Снижение цены - успешно");
        System.out.println(" ----------------- ");
    }

    private int minPriceIndex(ArrayList<SweetBase> sweetArray) {
        int index = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < sweetArray.size(); i++) {
            if (sweetArray.get(i).getPrice() < min) {
                min = sweetArray.get(i).getPrice();
                index = i;
            }
        }
        return index;
    }

    private int minWeightIndex(ArrayList<SweetBase> sweetArray) {
        int index = -1;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < sweetArray.size(); i++) {
            if (sweetArray.get(i).getWeight() < min) {
                min = sweetArray.get(i).getWeight();
                index = i;
            }
        }
        return index;
    }
}
