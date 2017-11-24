public class CheckingAccount extends Account{
public CheckingAccount(String owner,double bal,int iban){
super(owner,bal,iban);}

public double withdraw(double amount){
if (balance>amount)
balance-=amount;
System.out.println("The new Balance after withdrawl is :"+balance);
return balance;
}



public void compoundIntrest(){
System.out.println("The current balance is: "+balance);

}

}