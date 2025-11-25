package org.example;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CalculatorTester {
    Calculator calculator=new Calculator();

    @Test(groups={"BasicOperations"})
    public void testAdd(){
        Assert.assertEquals(calculator.add(3,2),5);
    }
    @Test(groups = "BasicOperations")
    public void testSubstract(){
        Assert.assertEquals(calculator.subtract(3,2),1);
    }
    @Test()
    public void testMultiply(){
        Assert.assertEquals(calculator.multiply(3,2),6);
    }
    @Test()
    public void testDivide(){
       Assert.assertEquals(calculator.divide(3,2),1.5);
    }
}
