package miscellaneous;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Anil Garg
 *
 */
public class UniqueCharacterTest {

	@Test
	public void test() {
		UniqueCharacter un =  new UniqueCharacter();
		assertEquals("MyNaMe must be false", false, un.UniqueCharacters("MyNaMe"));
		assertEquals("MyName must be true", true, un.UniqueCharacters("MyName"));
		assertEquals("MyNameMoh must be false", false, un.UniqueCharacters("MyNameMoh"));
		//fail("Not yet implemented");
	}

}
