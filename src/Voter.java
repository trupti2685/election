
public class Voter {
	
	private static int count1;
	private int id;
	public Voter(int id,Candidate c)
	{
		this.id=id;
		count1++;
	}
	
	public int getId() {
		return id;
	}

	public static int counter()
	{
		return count1;
	}
	
	public static void resetCounter()
	{
		count1=0;
	}

	public static int getCounter1() {
		return count1;
	}
	
}
