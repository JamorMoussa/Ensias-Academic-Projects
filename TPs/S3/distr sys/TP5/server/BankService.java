package client;

import java.rmi.*;
import java.util.*;


public interface BankService extends Remote{

	public float getBalanceById(int Id) throws RemoteException;

	public void withdrawById(int Id, float amount) throws RemoteException;

	public void sendBalance(int Id_from, int Id_to, float amount) throws RemoteException;

	public String getNameById(int Id) throws RemoteException;

	public void createAccount(int Id, String name, float amount) throws RemoteException;

	public ClientAccount getAccountById(int Id) throws RemoteException;

}