package org.example;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CalculatorTester {
    Calculator calculator=new Calculator();

    @Test(priority = 1)
    public void testAdd(){
        Assert.assertEquals(calculator.add(3,2),5);
    }
    @Test(priority = 3, dependsOnMethods = {"testAdd","testDivide"})
    public void testSubstract(){
        Assert.assertEquals(calculator.subtract(3,2),1);
    }
    @Test(priority = 4)
    public void testMultiply(){
        Assert.assertEquals(calculator.multiply(3,2),6);
    }
    @Test(priority = 5)
    public void testDivide(){
       Assert.assertEquals(calculator.divide(3,2),1.5);
    }
}
