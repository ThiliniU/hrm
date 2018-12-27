package com.pragmatic.testNG;

import org.testng.annotations.Test;

public class TestNGExample6
{
    @Test
    public void beforeClass()
    {
        System.out.println("TestNGExample6.beforeClass");
    }


    @Test
    public void afterClass()
    {
        System.out.println("TestNGExample6.afterClass");
    }



    @Test
    public void testMethod1()
    {
        System.out.println("TestNGExample1.testMethod1");
    }

    @Test
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
    public void testMetho4()
    {
        System.out.println("TestNGExample1.testMetho41");
    }
}
