package client;

// import java.rmi.RMISecurityManager;
import java.rmi.Naming;

public class NamingBankClient {
    public static void main(String[] args) {
        try {

            System.setProperty("java.security.policy", "client.policy");

            String rmiUrl = "rmi://localhost:1099/BankService";
            BankService bankService = (BankService) Naming.lookup(rmiUrl);

            bankService.createAccount(0, "John", 1000);
            bankService.createAccount(1, "John", 1001);
            bankService.createAccount(2, "John", 1002);




        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

