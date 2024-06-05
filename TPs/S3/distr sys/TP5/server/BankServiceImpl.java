package server;



import java.util.*;
import java.rmi.*;
import java.rmi.server.*;


public class BankServiceImpl extends UnicastRemoteObject implements BankService{

	ArrayList<ClientAccountImpl> accounts = new ArrayList<ClientAccountImpl>();

	public BankServiceImpl()throws RemoteException{

	}


	public float getBalanceById(int Id) throws RemoteException{
		return getAccountById(Id).getBalance();
	}

	public void withdrawById(int Id, float amount) throws RemoteException{

	}

	public void sendBalance(int Id_from, int Id_to, float amount) throws RemoteException{

	}

	public String getNameById(int Id) throws RemoteException{
		return getAccountById(Id).getName();

	}

	public void createAccount(int Id, String name, float amount) throws RemoteException{

		ClientAccountImpl client_acc = new ClientAccountImpl(Id, name, amount);

		accounts.add(client_acc);
	
	}


	public ClientAccountImpl getAccountById(int Id) throws RemoteException{

		ClientAccountImpl acc;

		for(int i=0;i< accounts.size(); i++){
			acc = accounts.get(i);
			if(acc.getId() == Id)
				return acc;
		}

		return new ClientAccountImpl(-1, "None", 0);
	}

}