
public class Queue 
{ 
	//made a change
	private person d2f;	
	public Queue()
	{
		this.d2f = null; 
	}
	public void enqueue(String name)
	{
		person n = new person(name); 
		if(this.d2f == null)
		{
			this.d2f = n; 
			n.setFirstperson(this.d2f);
		}
		else 
		{
			
			this.d2f = n; 
			
		}
	}
	public void display() throws Exception
	{
		System.out.println("Hi, ,my name is Person: " + d2f.getName() + "and I have :$" + d2f.getWalletBalance() +" on me");
		
	}
	public person dequeue() throws Exception
	{
		if(this.d2f == null)
		{
			throw new Exception("This queue is empty");
		}
		else
		{
			person valToReturn = this.d2f.getFirstperson(); 
			this.d2f = this.d2f.getLastperson(); 
			return valToReturn; 
		}
	}

}
