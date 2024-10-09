package Chapter9;

public class Cake {
    private double cakeprice;
    private String cakeflavor;

    public Cake(String cakeflavor, double cakeprice) {
        setCakeflavor(cakeflavor);
        setCakeprice(cakeprice);
    }

    public String getCakeflavor() {
        return cakeflavor;
    }

    public void setCakeflavor(String cakeflavor) {
        this.cakeflavor = cakeflavor;
    }

    public double getCakeprice() {
        return cakeprice;
    }

    public void setCakeprice(double cakeprice) {
        this.cakeprice = cakeprice;
    }




}
