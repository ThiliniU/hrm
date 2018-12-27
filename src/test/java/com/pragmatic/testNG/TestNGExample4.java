package com.pragmatic.testNG;

import org.testng.annotations.Test;

public class TestNGExample4
{
    @Test(priority = 1)
    public void testMethod1()
    {
        System.out.println("TestNGExample1.testMethod1");
    }
    @Test
    public void testMethod2()
    {
        System.out.println("TestNGExample1.testMethod2");
    }
    @Test (priority = 0)
    public void testMethod3()
    {
        System.out.println("TestNGExample1.testMethod3");
    }
    @Test(priority = 2)
    public void testMetho4()
    {
        System.out.println("TestNGExample1.testMetho41");
    }
}
