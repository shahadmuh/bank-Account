public class TestAccount {
public static void main (String[] args){

Account[] Accounts=new Account[6];

ShortTermSaving short1=new ShortTermSaving("Khalid Ali",1500.0,23521,5,8.0);

CheckingAccount check=new CheckingAccount("Sarah Sami",352.0,23523);

ShortTermSaving short2=new ShortTermSaving("Mohammed Waleed",2333.0,3452,50,5.0);

LongTermSaving long1=new LongTermSaving("Noura Ibrahim",24000.5,45425,400,25.0);

Accounts[0]=short1;
Accounts[1]=check;
Accounts[2]=short2;
Accounts[3]=long1;

for (int i=0;i<Accounts.length;i++){
if (Accounts[i] instanceof CheckingAccount)
System.out.println(Accounts[i].toString());
if (Accounts[i] instanceof SavingsAccount)
System.out.println(Accounts[i].toString());}

System.out.println();
System.out.println("The Balance After deposit:" );

for (int s=0;s<Accounts.length;s++){
if (Accounts[s] instanceof CheckingAccount)
Accounts[s].deposit(400.0);
//Accounts[s].compoundIntrest();}
if (Accounts[s] instanceof SavingsAccount)
Accounts[s].deposit(400.0);
//Accounts[s].compoundIntrest();}
}

System.out.println();

System.out.println("The Balance After withdrawl:" );

for (int f=0;f<Accounts.length;f++){
if (Accounts[f] instanceof CheckingAccount)
Accounts[f].withdraw(50.0);
if (Accounts[f] instanceof SavingsAccount)
Accounts[f].withdraw(50.0);
}
System.out.println();
System.out.println("The Balance After compound intrest:" );

for (int w=0;w<Accounts.length;w++){
if (Accounts[w] instanceof CheckingAccount)
Accounts[w].compoundIntrest();
if (Accounts[w] instanceof SavingsAccount)
Accounts[w].compoundIntrest();}

System.out.println();

System.out.println("The Information after Changes: ");
for (int i=0;i<Accounts.length;i++){
if (Accounts[i] instanceof CheckingAccount)
System.out.println(Accounts[i].toString());
if (Accounts[i] instanceof SavingsAccount)
System.out.println(Accounts[i].toString());}


}}