package Chapter9;

public class WeddingCake extends Cake{

    public WeddingCake(){
        super("Strawberry", 2000);
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    private int tiers;
}
