package org.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * You must document class
 */
class PrTestTest {

	/**
	 * You must document method
	 */
	@Test
	void pr() {
		PrTest prTest = new PrTest();
		Assertions.assertTrue(prTest.pr().contains("Hello, World!"));
	}
}
