package dMassiveGenerics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.*;
import org.junit.jupiter.api.BeforeEach;

class AllTests<E> {
	
	private CreateDMGen<String> create = new CreateDMGen<>();
	private CreateDMGen<Integer> create2 = new CreateDMGen<>();
	private CreateDMGen<Character> create3 = new CreateDMGen<>();
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("The test started");
		create.add("some string");
		create2.add(123);
		create3.add('G');
	}

	@Test
	void testAdd() {	
		assertEquals(create, "lisp");
		fail("Not yet implemented");
	}


	@Test
	void testLength() {
		create.length();
		fail("Not yet implemented");
	}


	@Test
	void testPrint() {
		fail("Not yet implemented");
	}

	
	@Test
	void testToArray() {
		fail("Not yet implemented");
	}
 
	@Test
	void testIndex() {
		fail("Not yet implemented");
	}
}
