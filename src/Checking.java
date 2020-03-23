public class Checking extends Account {
    int debitCardNumber;
    int debitCardPIN;

    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Your Checking Account features" +
                "\n Debit Card Number: " + debitCardNumber +
                "\n Debit Card PIN: " + debitCardPIN);
    }
}
