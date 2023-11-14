public class ResidentialSite implements Site{

    public double getTax(double base) {
        return base * Site.taxRate;
    }

    public double getBase(double units, double rate) {
        return units * rate;
    }
}