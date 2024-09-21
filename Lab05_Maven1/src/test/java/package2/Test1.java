/**
 * 
 */
package package2;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import package1.Hello_World;

/**
 * 
 */
public class Test1 {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void test() {
		String[] arrar1  = {"a", "b", "c", "d", "e"};
		
		
		Hello_World helloWorld = new Hello_World();
		helloWorld.main(arrar1);
		
		
	}

}
