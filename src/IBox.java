public interface IBox {
    void add(SweetBase sweet);
    void delete(int index);
    double getWeight();
    int getPrice();
    void printInfo();
    void reduceWeight(double weight);
    void reducePrice(int price);
}
