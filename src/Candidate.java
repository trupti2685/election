public class Candidate
{

    private String name;    
    private int vote;
    
	public Candidate(Evm evm,String name)
    {        
    	this.name = name;
        vote = 0;
    }


    public void incrementVoteCount()
    {
        vote++;
    }

    public String getName()
    {
        return name;
    }
    
    public int getNumberOfVote()
    {
        return vote;
    }
    
	
    

}