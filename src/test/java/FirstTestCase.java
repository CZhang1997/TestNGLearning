package test.java;

import org.testng.annotations.Test;

/**
 * @Author: churongzhang
 * @Github: czhang1997
 * @Date: 2/11/22
 * @Description:
 */
public class FirstTestCase {

    @Test(priority = 1)
    public void setup(){
        System.out.println("This is a test setup");
    }

    @Test(priority = 2)
    public void login(){
        System.out.println("this is a  login test");
    }

    @Test(priority = 3)
    public void teardown(){
        System.out.println("This is a tear down test");
    }

}
