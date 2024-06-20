import java.util.Scanner;
public class Lab5_4 {
    public static void main(String[] args) {
        Bank_Account a = new Bank_Account();
        a.getAccountDetails();
    }
}
class Bank_Account{
    int accountNo ;
    String userName;
    String email;
    String accountType;
    int accountBalance;
    void getAccountDetails(){
        Scanner as = new Scanner(System.in);
        System.out.print("Enter your account no. : ");
        int account = as.nextInt();
        System.out.print("Enter your name : ");
        String userName = as.nextLine();
        System.out.print("Enter your account no. : ");
        String email = as.nextLine();
        System.out.print("Enter your account type no. : ");
        String accountType = as.nextLine();
        System.out.print("Enter your account balance no. : ");
        int accountBalance = as.nextInt();

        
        
        


    }
}
