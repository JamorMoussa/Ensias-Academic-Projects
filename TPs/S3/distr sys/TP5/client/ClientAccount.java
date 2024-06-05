package server;


public interface ClientAccount{

	private final int Id;
	private final String name;
	private float solde;


	public ClientAccount(int Id, String name, float solde);

	public int getId();

	public float getBalance();

	public String getName();


}