public class Main {
    public static void main(String[] args) {

        ATM atm=new withdrawalAtm();
        atm.withdraw();
        atm=new DepositAtm();
        atm.deposit();
    }
}