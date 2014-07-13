package oop.asg02;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Unit test for BigIntegerDemo class.
 */
public class BigIntegerDemoTest
{
    @Test
    public void testCreateBigIntegerDemoFromInt()
    {
        BigIntegerDemo bigInt = new BigIntegerDemo(10);
        assertEquals("10", bigInt.toString());
    }
    
    @Test
    public void testCreateBigIntegerDemoFromStringWithLeadingZero()
    {
        BigIntegerDemo bigInt = new BigIntegerDemo("010");
        assertEquals("10", bigInt.toString());
    }

    @Test
    public void testCreateBigIntegerDemoFromStringWithAllZeros()
    {
        BigIntegerDemo bigInt = new BigIntegerDemo("000");
        assertEquals("0", bigInt.toString());
    }

    @Test
    public void testCreateBigIntegerDemoFromStringWithAllButUnitZeros()
    {
        BigIntegerDemo bigInt = new BigIntegerDemo("001");
        assertEquals("1", bigInt.toString());
    }

    @Test
    public void testConvertToLongWhenNotOverRange()
    {
        BigIntegerDemo bigInt = new BigIntegerDemo("10");
        assertEquals(10L, bigInt.toLong());
    }
    
    @Test
    public void testEquality()
    {
        BigIntegerDemo bigInt1 = new BigIntegerDemo(10);
        BigIntegerDemo bigInt2 = new BigIntegerDemo(10);
        BigIntegerDemo bigInt3 = new BigIntegerDemo("10");
                
        assertEquals(bigInt1, bigInt2);
        assertEquals(bigInt1, bigInt3);
    }
    
    @Test
    public void testInequality()
    {
        BigIntegerDemo bigInt1 = new BigIntegerDemo(10);
        BigIntegerDemo bigInt2 = new BigIntegerDemo(12);
                
        assertFalse(bigInt1.equals(bigInt2));
    }
    
    @Test
    public void testAdditionWithoutCarryOn()
    {
        BigIntegerDemo bigInt1 = new BigIntegerDemo("111111111111111111111");
        BigIntegerDemo bigInt2 = new BigIntegerDemo("1");
        BigIntegerDemo sum = bigInt1.add(bigInt2);
        
        assertEquals(new BigIntegerDemo("111111111111111111112"), sum);
    }
   
	@Test
    public void testAdditionWithCarryOn()
    {
        BigIntegerDemo bigInt1 = new BigIntegerDemo("111111111111111111111");
        BigIntegerDemo bigInt2 = new BigIntegerDemo("9");
        BigIntegerDemo sum = bigInt1.add(bigInt2);
        
        assertEquals(new BigIntegerDemo("111111111111111111120"), sum);
    }
    
    @Test
    public void testSubtractionWithoutCarryOn()
    {
        BigIntegerDemo bigInt1 = new BigIntegerDemo("111111111111111111111");
        BigIntegerDemo bigInt2 = new BigIntegerDemo("1");
        BigIntegerDemo difference = bigInt1.subtract(bigInt2);
        
        assertEquals(new BigIntegerDemo("111111111111111111110"), difference);
    }
    
    @Test
    public void testSubtractionWithCarryOn()
    {
        BigIntegerDemo bigInt1 = new BigIntegerDemo("111111111111111111111");
        BigIntegerDemo bigInt2 = new BigIntegerDemo("9");
        BigIntegerDemo difference = bigInt1.subtract(bigInt2);
        
        assertEquals(new BigIntegerDemo("111111111111111111102"), difference);
    }
}