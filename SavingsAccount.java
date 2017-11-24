public  abstract class SavingsAccount extends Account{
protected int lastWithdrawn;
private double intrest;

public SavingsAccount(String owner,double bal, int ban,int lastW,double intrest){
super(owner,bal,ban);
lastWithdrawn=lastW;
this.intrest=intrest;}

public void compoundIntrest(){
balance+=balance*(intrest/100);
System.out.println("The current balance is: "+balance);}


public String toString(){
return super.toString()+"\nLast withdrawn: "+lastWithdrawn+"\nIntrest: "+intrest+"%";

}}