import java.util.List;

public class Application {
    public static void main(String[] args) {

        String file = "src/original.csv";

        Checking chkacc1 = new Checking("Tom Wilson", "123456789", 1500);
        Savings savacc1 = new Savings("Rich Lowe", "987654321", 2500);

        savacc1.compound();

        chkacc1.showInfo();
        System.out.println("********************* ");
        savacc1.showInfo();

        List<String[]> newAccountHolders = CSV.read(file);
        for (String[] accountHolder : newAccountHolders) {
            System.out.println("NEW ACCOUNT");
            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);
        }
    }
}
