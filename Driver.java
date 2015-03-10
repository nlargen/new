import java.util.Random;


public class Driver
{
	private static Random r = new Random(); 
	
	
	public static void main(String[] goat) throws Exception
	{	
		 
		
		for(int i = 0; i < 100; i++)
		{ 
			Queue p = new Queue();
			String ran = "" + Driver.r.nextInt(100);
			person x = new person(ran);
			p.enqueue(x);
			p.display();
		}
		
		
		
	}
}
