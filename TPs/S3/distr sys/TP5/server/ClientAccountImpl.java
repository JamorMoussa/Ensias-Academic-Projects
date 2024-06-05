package server;


public class ClientAccountImpl implements ClientAccount{

	private final int Id;
	private final String name;
	private float solde;


	public ClientAccountImpl(int Id, String name, float solde){
		this.Id = Id;
		this.name = name;
		this.solde = solde;

	}

	public int getId(){
		return Id;
	}

	public float getBalance(){
		return solde;
	}

	public String getName(){
		return name;
	}

/*	public static void main(String[] args){


		ClientAccountImpl acc = new ClientAccountImpl(0, "Moussa", 1000);

		System.out.println(acc.getId());
		System.out.println(acc.getName());
		System.out.println(acc.getBalance());

	}*/

}