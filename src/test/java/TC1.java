import org.testng.annotations.*;

/**
 * @Author: churongzhang
 * @Github: czhang1997
 * @Date: 2/12/22
 * @Description:
 */
public class TC1 {



    @BeforeTest
    public void beforeTest(){
        System.out.println("this will execute before the test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("This will execute before the class");
    }


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This will execute before every method");
    }

    @Test
    public void test1(){
        System.out.println("This is test1....");
    }

    @Test
    public void test2(){
        System.out.println("this is test2....");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("this method will execute after every method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("This will execute after the class");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("this will execute after the test");
    }

}
