package org.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * You must document test class
 */
class MainTest {

	/**
	 * You must document test method
	 */
	@Test
	void method1() {
		Main tes = new Main();

		Assertions.assertTrue(tes.method(false));
		Assertions.assertFalse(tes.method(true));
		Assertions.assertFalse(tes.method(false) && tes.method(true));
	}
}
