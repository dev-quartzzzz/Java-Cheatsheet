public class App {
    public static void main(String[] args) throws Exception {
        HighVoltageBicycle b1 = new HighVoltageBicycle(100);

        b1.speedUp(14);
        System.out.println(b1.speed);

        b1.speedDown(15);
        System.out.println(b1.speed);

        b1.brake();
        System.out.println(b1.speed);
    }
}

