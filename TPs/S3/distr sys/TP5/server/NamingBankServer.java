package server;


// import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.Naming;

public class NamingBankServer {
    public static void main(String[] args) {
        try {
            
            System.setProperty("java.security.policy", "server.policy");
            

            BankService bankService = new BankServiceImpl();

            Registry registry = LocateRegistry.createRegistry(1099);

            String rmiUrl = "rmi://localhost:1099/BankService";
            Naming.rebind(rmiUrl, bankService);

            System.out.println("BankServer is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

