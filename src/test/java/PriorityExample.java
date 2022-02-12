import org.testng.annotations.Test;

/**
 * @Author: churongzhang
 * @Github: czhang1997
 * @Date: 2/12/22
 * @Description:
 */
public class PriorityExample {

    @Test(priority = 0)
    public void testOne(){
        System.out.println("this is test one");
    }

    @Test(priority = 1)
    public void testTwo(){
        System.out.println("this is test two");
    }

    @Test(priority = 2, enabled = false)
    public void testThree(){
        System.out.println("this is test three");
    }

    @Test(priority = 3)
    public void testFour(){
        System.out.println("this is test four");
    }

}
