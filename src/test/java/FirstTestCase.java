package test.java;

import org.testng.annotations.Test;

/**
 * @Author: churongzhang
 * @Github: czhang1997
 * @Date: 2/11/22
 * @Description:
 */
public class FirstTestCase {

    @Test
    public void setup(){
        System.out.println("This is a test setup");
    }

    @Test
    public void login(){
        System.out.println("this is a  login test");
    }

    @Test
    public void teardown(){
        System.out.println("This is a tear down test");
    }

}
