public class Application {
    public static void main(String[] args) {
        Checking chkacc1 = new Checking("Tom Wilson", "123456789", 1500);
        Savings savacc1 = new Savings("Rich Lowe", "987654321", 2500);

        savacc1.compound();

        chkacc1.showInfo();
        System.out.println("********************* ");
        savacc1.showInfo();
    }
}
