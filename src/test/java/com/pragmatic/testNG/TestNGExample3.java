package com.pragmatic.testNG;

import org.testng.annotations.Test;

public class TestNGExample3
{
    @Test
    public void testMethod1()
    {
        System.out.println("TestNGExample1.testMethod1");
    }
    @Test(enabled = false)
    public void testMethod2()
    {
        System.out.println("TestNGExample1.testMethod2");
    }
    @Test
    public void testMethod3()
    {
        System.out.println("TestNGExample1.testMethod3");
    }
    @Test
    public void testMetho41()
    {
        System.out.println("TestNGExample1.testMetho41");
    }
}
