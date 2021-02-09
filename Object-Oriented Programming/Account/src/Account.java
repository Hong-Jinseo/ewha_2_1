
public class Account {
	public int balance; //잔고
	public String owner; //계정 주인 이름
	public double rate; //이율(연이율)
	
	public Account(String n, double r){
		owner = n;
		rate = r;
		balance = 0;	
	}
	
	public Account(String n, int b, double r){
		owner = n;
		rate = r;
		balance = b;
	}
	
	public void deposit(int m){
		balance+=m;
	}

	public void withdraw(int m){
		balance-=m;
	}
	
	public void computeTotal(){
		balance+=balance*rate/12.0;
	}
	
	public void computeTotal(int m){
		balance+=balance*rate*m/12.0;
	}
	
	public void showAll() {
		System.out.println("Owner : "+owner);
		System.out.println("Balance : "+balance);
		System.out.println("Rate : "+rate);
	}
	
	public void showOwner( ) {
		System.out.println("Owner = " + owner);	
	}
	
	public void showBalance( ) {
		System.out.println("Balance = " + balance);	
	}
	
	public void showRate( ) {
		System.out.println("Rate = " + rate);	
	}
}
