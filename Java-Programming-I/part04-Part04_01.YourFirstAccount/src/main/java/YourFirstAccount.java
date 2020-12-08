
public class YourFirstAccount {

    public static void main(String[] args) {
        Account eduardoAccount = new Account("Eduardo's account",100.00);
        
        eduardoAccount.deposit(20);
        String balanceEduardo = eduardoAccount.toString();
        
        System.out.println(balanceEduardo);
    }
}
