import static org.junit.Assert.*;

import org.junit.Test;

public class TestMaths {

	@Test
	public void addition() {

		Maths testing = new Maths();
		assertEquals("not working",25,testing.addition(20, 5));

	}

	@Test
	public void subtraction() {

		Maths testing = new Maths();
		assertEquals("not working",15,testing.subtraction(20, 5));

	}

	@Test
	public void multiplication() {

		Maths testing = new Maths();
		assertEquals("not working",100,testing.multiplication(20, 5));

	}

	@Test
	public void division() {

		Maths testing = new Maths();
		assertEquals("not working",4,testing.division(20, 5));

	}

}