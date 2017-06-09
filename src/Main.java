
public class Main {

	public static void main(String[] args) {
		
		Evm p=new Evm(1,"porvorim");
		Candidate cd1=new Candidate(p,"trupti");
		Candidate cd2=new Candidate(p,"tanaya");
		
		Evm m=new Evm(2,"Mapusa");
		Candidate cd3=new Candidate(m,"yash");
		Candidate cd4=new Candidate(m,"tanvi");
		
		
		Voter v=new Voter(101,cd1);
		cd1.incrementVoteCount();
		System.out.println("Vote recorded");
		
		
		Voter v2=new Voter(102,cd1);
		cd1.incrementVoteCount();
		System.out.println("");
		
		
		Voter v5=new Voter(103,cd1);
		cd1.incrementVoteCount();
		System.out.println("Vote record");
		
		
		Voter v3=new Voter(103,cd3);
		cd3.incrementVoteCount();
		System.out.println("Vote record");
		
	
		Voter v4=new Voter(104,cd3);
		cd3.incrementVoteCount();
		System.out.println("Vote record");
		
		Voter v6=new Voter(104,cd3);
		cd3.incrementVoteCount();
		System.out.println("Vote record");
		
		
		System.out.println(cd1.getName()+" got "+cd1.getNumberOfVote()+" number of votes from "+ p.getConstinuency());
		System.out.println(cd2.getName()+" got "+cd2.getNumberOfVote()+" number of votes from "+ p.getConstinuency());
		
		System.out.println(cd3.getName()+" got "+cd3.getNumberOfVote()+" number of votes from "+ m.getConstinuency());
		System.out.println(cd4.getName()+" got "+cd4.getNumberOfVote()+" number of votes from "+ m.getConstinuency());
		
		
		System.out.println("Total number of votes is "+Voter.counter());
	
		
		Voter.resetCounter();
		System.out.println("Reseting counter:");
		System.out.println("Total number of votes  "+Voter.counter());
	
		
		System.out.println("Closing poll:");
		System.out.print(Evm.closepoll());
		
	}

}
