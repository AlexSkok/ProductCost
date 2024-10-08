package ua.it.hillel;

public class CalcCostBase {
    public double calcCost(Product product) {
        return product.getQuota() * product.getPrice();
    }
}
