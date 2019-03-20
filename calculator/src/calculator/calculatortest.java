package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculatortest {

	@Test
	void calculatortest() 
	{
		calculator obj = new calculator();
		assertEquals(25,obj.addition(10, 15));
		assertEquals(10,obj.subt(25, 15));
		assertEquals(24,obj.multiplication(3, 8));
		assertEquals(7,obj.division(56,8));
		assertEquals(1,obj.mod(13, 12));
	}

}
