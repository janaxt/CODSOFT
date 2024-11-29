package task3;

public class BankAccount {
	
	private double accBalance;

	public BankAccount(double accBalance) {
		this.accBalance = accBalance;
	}
	
	public boolean deposit(double amount){
        if (amount>0){
            accBalance+=amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount){
        if (amount> 0 && amount <=accBalance){
            accBalance -= amount;
            return true;
        }
        return false;
    }

    public double checkBalance(){
        return accBalance;
    }

}
