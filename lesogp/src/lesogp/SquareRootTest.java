package lesogp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareRootTest {

	@Test
	void test() {
		assert SquareRoot.squareroot(9) == 3;
		assert SquareRoot.squareroot(8) == 2;
	}

}
