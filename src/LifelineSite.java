public class LifelineSite implements Site{

    private double getTax(double base) {
        return base * Site.taxRate * 0.2;
    }

    private double getBase(double units, double rate) {
        return units * rate * 0.5;
    }
}
