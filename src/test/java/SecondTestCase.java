import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Author: churongzhang
 * @Github: czhang1997
 * @Date: 2/11/22
 * @Description:
 */
public class SecondTestCase {

    @Test(priority = 1)
    public void setup(){
        System.out.println("This is a test setup");
    }

    @Test(priority = 2)
    public void searchCustomer(){
        System.out.println("this is a searchCustomer test");
        Assert.assertEquals(1,1);
    }

    @Test(priority = 3)
    public void addCustomer(){
        System.out.println("this is a addCustomer test");
    }

    @Test(priority = 5)
    public void teardown(){
        System.out.println("This is a tear down test");
    }
}
