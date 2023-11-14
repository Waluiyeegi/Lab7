public class LifelineSite implements Site{
    public double getBillableAmount(double units, double rate){
        double base = getBase(units, rate);
        double tax = getTax(base);
        return base + tax;
    }

    private double getTax(double base) {
        return base * Site.taxRate * 0.2;
    }

    private double getBase(double units, double rate) {
        return units * rate * 0.5;
    }
}
