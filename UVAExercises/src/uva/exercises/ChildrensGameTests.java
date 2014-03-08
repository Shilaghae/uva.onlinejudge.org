package uva.exercises;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ChildrensGameTests {

	private ChildrensGame childrensGame;
	@Before
	public void setUp() throws Exception {
		childrensGame = new ChildrensGame();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPlay1() {
		long play = childrensGame.play(new int[]{123, 124, 56, 90});
		assertEquals("Wrong result!", 9056124123L, play);
	}
	@Test
	public void testPlay2() {
		long play = childrensGame.play(new int[]{123, 124, 56, 90, 9});
		assertEquals("Wrong result!", 99056124123L, play);
	}
	@Test
	public void testPlay3() {
		long play = childrensGame.play(new int[]{9, 9, 9, 9, 9});
		assertEquals("Wrong result!", 99999L, play);
	}
	
	@Test
	public void testCompare1() {
		long play = childrensGame.compare(99, 91);
		assertEquals("Wrong result!", 99, play);
	}
	@Test
	public void testCompare2() {
		long play = childrensGame.compare(123, 124);
		assertEquals("Wrong result!", 124, play);
	}
	@Test
	public void testCompare3() {
		long play = childrensGame.compare(90, 9);
		assertEquals("Wrong result!", 9, play);
	}
	@Test
	public void testCompare4() {
		long play = childrensGame.compare(9, 90);
		assertEquals("Wrong result!", 9, play);
	}
	

}
