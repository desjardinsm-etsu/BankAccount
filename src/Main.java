import javax.swing.*;

public class Main {

    public static void main(String[] args)
    {
	    run();
    }

    public static void run()
    {
        //Create this bank account

        BankAccount account = new BankAccount();
        Owner owner = new Owner();

        account.setInterestRate(.01);
        int amount = Integer.parseInt(JOptionPane.showInputDialog("How much do you want to deposit?"));
        account.deposit(amount);

        System.out.println(account.getBalance());




    }
}
