package com.packtpub;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * Date: 9/8/13
 * Time: 11:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class CalculatorTest extends TestCase {
    public void testSum() throws Exception {
        Calculator calculator = new Calculator();
        int sum = calculator.sum(1, 2);
        Assert.assertEquals(3, sum);
    }

    public void testSum2() throws Exception {
        Calculator calculator = new Calculator();
        int sum = calculator.sum(-1, -1);
        Assert.assertEquals(-2, sum);
    }

    public void testSubtract() throws Exception {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(44, 2);
        Assert.assertEquals(42, result);
    }

    public void testSubtract2() throws Exception {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(-2, -2);
        Assert.assertEquals(0, result);
    }
}
