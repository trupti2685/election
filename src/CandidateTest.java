import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CandidateTest {

	@Before
	public void setUp() throws Exception {
	}

	Candidate a,b,c;
	Evm p;
	
	@Test
	public void testGetName() {
		
		a=new Candidate(p,"trupti");
		assertEquals("tanaya",a.getName());
		
		b=new Candidate(p,"trupti");
		assertEquals("trupti",b.getName());
		
	}

	@Test
	public void testGetNumberOfVote() {
		c=new Candidate(p,"trupti");
		assertEquals(0,c.getNumberOfVote());
	}

}
