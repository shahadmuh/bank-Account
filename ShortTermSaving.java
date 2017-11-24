public class ShortTermSaving extends SavingsAccount {
public ShortTermSaving(String owner, double bal, int ban, int lastW, double intreset){
super (owner,bal,ban,lastW,intreset);}


public double withdraw (double amount){
if (lastWithdrawn>30){
if (balance>amount)
balance-=amount;
lastWithdrawn=0;
System.out.println("The new Balance after withdrawl is: "+balance);}
else
System.out.println("Withdrawl is not allowed, your current balance is: "+balance);

return balance;
}
}
