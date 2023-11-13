public class ResidentialSite implements Site{
    public double getBillableAmount(double units, double rate){
        double base = units * rate;
        double tax = base * Site.taxRate;
        return base + tax;
    }
}
