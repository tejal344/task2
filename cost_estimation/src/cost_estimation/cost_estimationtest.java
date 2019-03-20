package cost_estimation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class cost_estimationtest {

	@Test
	void cost_estimationtest() {
		cost_estimation c = new cost_estimation();
		assertEquals(6000, c.cost(5, "standard"));
		assertEquals(3000, c.cost(2, "abovestandard"));
		assertEquals(5400, c.cost(3, "highstandard"));

	}

}
