public interface Site {
    double taxRate = 1.15;
    private double getBillableAmount(double base, double units, double rate){
        return getTax(base) + getBase(units,rate);
    }

    double getTax(double base);

    double getBase(double units, double rate);
}
