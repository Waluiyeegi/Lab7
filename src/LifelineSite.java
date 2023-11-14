public class LifelineSite implements Site{

    public double getTax(double base) {
        return base * Site.taxRate * 0.2;
    }

    public double getBase(double units, double rate) {
        return units * rate * 0.5;
    }
}
