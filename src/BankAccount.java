public class BankAccount
{

    private String accountNumber;
    private String routingNumber;
    private Owner owner;
    private double balance;
    private String type;
    private double interestRate;


    public void setInterestRate(double rate)
    {
        interestRate = rate;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public double getInterestRate()
    {
        return interestRate;
    }

    public double getBalance()
    {
        return balance;
    }

}
