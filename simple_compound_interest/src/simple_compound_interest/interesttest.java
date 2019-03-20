package simple_compound_interest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class interesttest {

	@Test
	void interesttest() {
		simple_compound_interest i=new simple_compound_interest();
		assertEquals(100,i.calculateComp(100,2,3,1));
		assertEquals(6,i.calculateSimple(100, 2, 3));
		assertEquals(1,i.calculateSimple(100,1,1));
		
	}

}
