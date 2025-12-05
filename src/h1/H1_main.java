package h1;

public class H1_main {
    public static void main(String[] args) {

        Zahl z = new Zahl();

        z.num = 42;

        z.setEven();
        z.setPositive();
        z.setSmall();

        System.out.println("Zahl: " + z.num);
        System.out.println("Gerade?       " + z.even);
        System.out.println("Positiv?      " + z.positive);
        System.out.println("Kleiner 100?  " + z.small);
    }
}

