import java.util.Random;


public class person 
{

	private String name; 
	private person firstperson; 
	private person lastperson; 
	private int walletBalance;
	private static Random r = new Random();
	
	
	public person(String name)
	{
		
		this.name = name; 
		this.firstperson = null; 
		this.walletBalance = person.r.nextInt(10); 
		
	}
	public void display()
	{
		System.out.println("Hi, ,my name is Person: " + this.name + "and I have :$" + this.walletBalance +" on me");
	}
	
	public person getFirstperson() {
		return firstperson;
	}
	public void setFirstperson(person firstperson) {
		this.firstperson = firstperson;
	}
	public person getLastperson() {
		return lastperson;
	}
	public void setLastperson(person lastperson) {
		this.lastperson = lastperson;
	}
	public String getName() {
		return name;
	}
	public int getWalletBalance() {
		return walletBalance;
	}
	
	
	
}
