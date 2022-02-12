import org.testng.annotations.*;

/**
 * @Author: churongzhang
 * @Github: czhang1997
 * @Date: 2/12/22
 * @Description:
 */
public class TC2 {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("this will execute before the Suite");
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
    public void test3(){
        System.out.println("This is test3....");
    }

    @Test
    public void test4(){
        System.out.println("this is test4....");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("this method will execute after every method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("This will execute after the class");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("this will execute after the Suite");
    }
}
