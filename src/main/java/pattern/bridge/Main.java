package pattern.bridge;

public class Main {
    public static void main(String[] args) {

        DebitAccount debitAccountInRub = new DebitAccount(new Rub());
        DebitAccount debitAccountInByn = new DebitAccount(new Byn());

        System.out.println(debitAccountInRub.getAccountType());
        System.out.println(debitAccountInByn.getAccountType());

        SavingAccount savingAccountInUsdt = new SavingAccount(new Usdt());
        Account savingAccountInByn = new SavingAccount(new Byn());

        System.out.println(savingAccountInUsdt.getAccountType());
        System.out.println(savingAccountInByn.getAccountType());

        savingAccountInUsdt.deposit(100);
        savingAccountInUsdt.printBalance();

        debitAccountInByn.deposit(1000);
        debitAccountInByn.printBalance();
        debitAccountInByn.withdraw(50);
        debitAccountInByn.printBalance();


    }
}
