package Chapter9;

public class Test {
    public static void main(String[] args){



    Cake cake = new Cake("chocolate", 3000);
        System.out.println("Cake flavor: " + cake.getCakeflavor());
        System.out.println("Cake price: " + cake.getCakeprice());

     BirthdayCake birthdayCake = new BirthdayCake();
        System.out.println("Birthday cake flavor: " + birthdayCake.getCakeflavor());
        System.out.println("Birthday cake price: " + birthdayCake.getCakeprice());

    WeddingCake weddingCake = new WeddingCake();
        weddingCake.setCakeflavor("pina colada");
        System.out.println("Wedding cake flavor: " + weddingCake.getCakeflavor());
        System.out.println("Wedding cake price: " + weddingCake.getCakeprice());
}
}
