public class AccountDemo {
	public static void main(String[] args) {
	Account a = new Account("Hong",1000,0.03);
	Account b = new Account("Kim",0.05);
	
	a.showAll();
	a.deposit(300);
	a.withdraw(100);
	a.computeTotal(5);
	a.showOwner();
	a.showBalance();
	
	System.out.println("");
	
	b.showAll();
	b.deposit(300);
	b.withdraw(100);
	b.computeTotal(5);
	b.showOwner();
	b.showBalance();
	}
}
