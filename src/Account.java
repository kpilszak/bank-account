public abstract class Account implements IRate {
    String name;
    String sSN;
    double balance;

    String accountNumber;
    double rate;

    public Account(String name) {
        System.out.println("NAME: " + name);
        System.out.print("NEW ACCOUNT: ");
    }
}
