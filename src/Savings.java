public class Savings extends Account {
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        System.out.println("NEW SAVINGS ACCOUNT");
    }
}
