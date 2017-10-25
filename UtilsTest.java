import static org.junit.Assert.*;

import org.junit.Test;

public class UtilsTest {

	@Test
	public void calculateModuloShouldReturnPositiveValueCorrectly() {
		assertEquals(2, Utils.positiveModulos(-3, 5));
		assertEquals(2, Utils.positiveModulos(3, -5));
		assertEquals(0, Utils.positiveModulos(0, -5));
	}
	
	@Test(expected = RuntimeException.class)
	public void shouldThrowArithmeticExceptionWhenTryToDivideToZero() {
		Utils.positiveModulos(-5, 0);
	}

}
