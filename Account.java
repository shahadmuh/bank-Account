public abstract class Account{
protected String owner;
protected double balance;
protected int IBAN; 

public Account(String owner,double bal,int ban){
this.owner=owner;
balance=bal;
IBAN=ban;}

public double deposit(double amount){
balance+=amount;
System.out.println("The current balance is: "+balance);
return balance;}

public abstract double withdraw(double amount);


public abstract void compoundIntrest();

public String toString(){
return "Owner: "+owner+"\nBalance: "+balance+"\nIBAN: "+IBAN;}}