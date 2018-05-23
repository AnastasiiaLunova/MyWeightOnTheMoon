import static org.junit.Assert.*;

import org.junit.Test;

public class MoonWeightTest {

	@Test
	public void getWeight() {
		MoonWeight myTest = new MoonWeight();
		double runTest = myTest.getWeight(75);
		assertEquals(12.75, runTest, 0.09);
	}

}
