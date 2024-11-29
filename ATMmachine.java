package task3;

public class ATMmachine {
	
	private BankAccount balance;

    public ATMmachine(BankAccount balance) {
        this.balance = balance;
    }
	
    public void withdraw(double amount){
        if(amount>0 && amount<=balance.checkBalance()){
        	balance.withdraw(amount);
            System.out.println("Withdrawing amount: " +amount+"$ ...");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    
    public void deposit(double amount){
        if (amount>0){
        	balance.deposit(amount);
            System.out.println("Depositing amount: "+amount +"$ ...");
        } else{
            System.out.println("Invalid.");
        }
    }
    
    public void checkBalance() {
        System.out.println("Your balance is " + balance.checkBalance()+"$");
    }
	
	

}
