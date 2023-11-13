public class LifelineSite implements Site{
    public double getBillableAmount(double units, double rate){
        double base = units * rate * 0.5;
        double tax = base * Site.taxRate * 0.2;
        return base + tax;
    }
}
