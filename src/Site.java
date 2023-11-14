public interface Site {
    double taxRate = 1.15;
    double getBillableAmount(double units, double rate);
}
