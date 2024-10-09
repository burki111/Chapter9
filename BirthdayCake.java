package Chapter9;

public class BirthdayCake extends Cake{

    public BirthdayCake() {
        super("Vanilla", 1200);
    }
    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

    private int candles;


}
