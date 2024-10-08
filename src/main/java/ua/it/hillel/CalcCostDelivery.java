package ua.it.hillel;

public class CalcCostDelivery {
    private static final double deliveryPrice = 3.1;
    public double calcCost(Product product) {
        return product.getQuota() * product.getPrice() + deliveryPrice;
    }
}
