package oop.asg02;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * Unit test for simple BigIntegerDemo
 */
public class BigIntegerDemoTest {
    
    public BigIntegerDemoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class BigIntegerDemo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BigIntegerDemo instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class BigIntegerDemo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object other = null;
        BigIntegerDemo instance = null;
        boolean expResult = false;
        boolean result = instance.equals(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toLong method, of class BigIntegerDemo.
     */
    @Test
    public void testToLong() {
        System.out.println("toLong");
        BigIntegerDemo instance = null;
        long expResult = 0L;
        long result = instance.toLong();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class BigIntegerDemo.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        BigIntegerDemo other = null;
        BigIntegerDemo instance = null;
        BigIntegerDemo expResult = null;
        BigIntegerDemo result = instance.add(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class BigIntegerDemo.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        BigIntegerDemo other = null;
        BigIntegerDemo instance = null;
        BigIntegerDemo expResult = null;
        BigIntegerDemo result = instance.subtract(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
