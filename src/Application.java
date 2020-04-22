import java.util.List;

public class Application {
    public static void main(String[] args) {

        String file = "src/original.csv";

        List<String[]> newAccountHolders = CSV.read(file);
        for (String[] accountHolder : newAccountHolders) {
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
//            System.out.println(name + " " + sSN + " " + accountType + " $" + initDeposit);

            if (accountType.equals("Savings")) {
                System.out.println("OPEN  A SAVINGS ACCOUNT");
            } else if (accountType.equals("Checking")) {
                System.out.println("OPEN A CHECKING ACCOUNT");
            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }
    }
}
