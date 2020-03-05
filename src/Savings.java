public class Savings extends Account {
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    public Savings(String name) {
        super(name);
        System.out.println("NEW SAVINGS ACCOUNT");
    }
}
