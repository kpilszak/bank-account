public class Checking extends Account {
    int debitCardNumber;
    int debitCardPIN;

    public Checking(String name) {
        super(name);
        System.out.println("NEW CHECKING ACCOUNT");
    }
}
