package demo

import org.junit.Test

import static groovy.test.GroovyAssert.shouldFail
import static org.junit.Assert.assertTrue

public class AppTest {

	void should_true() {
		
		shouldFail {
			assertTrue( false )
		}
	}
}