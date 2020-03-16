public class Checking extends Account {
    int debitCardNumber;
    int debitCardPIN;

    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
        System.out.println("NEW CHECKING ACCOUNT");
    }
}
