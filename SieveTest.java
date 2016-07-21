import static org.junit.Assert.*;

import org.junit.Test;


public class SieveTest {

	
	
	@Test
	//Test that the IllegalArgumentException is thrown when parameters are input
	public void testCalculateMaxInvalid() {
		
		//Simulate empty parameter array
		String [] test = new String[0];
		
		try{
			Sieve.calculateMax(test);
		}catch(Exception e){
			//If IllegalArgumentException is caught, pass
			assertTrue(e.toString().contains("IllegalArgumentException"));
		}

	}
	
	@Test
	//Test that the IllegalArgumentException is not thrown when the parameter
	//input is present and greater than 1
	public void testCalculateMaxValid() {
		
		//Simulate empty parameter array
		String [] test = {"78"};
		
		try{
			Sieve.calculateMax(test);
		}catch(Exception e){
			//If an exception is caught, fail
			fail("An Exception Was Thrown");
		}
	}
	
	@Test
	//Test that printSieve will return BLANK when the only int in the array is 1
	public void testPrintSieveBlank(){
		int [] x = {1};
		Sieve.printSieve(x);
		
		assertTrue( Sieve.unitTest.equals("BLANK"));
	}
	
	@Test
	//Test that a populated sieve list prints out correctly
	public void testPrintSievePopulated(){
		int[] x = {1,2,3,5};
		Sieve.printSieve(x);
		assertTrue(Sieve.unitTest.equals("> 2 3 5 "));
	}

}
