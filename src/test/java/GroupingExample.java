import org.testng.annotations.Test;

/**
 * @Author: churongzhang
 * @Github: czhang1997
 * @Date: 2/12/22
 * @Description:
 */
public class GroupingExample {

    @Test(groups = {"sanity"})
    public void test1(){
        System.out.println("This is test 1...");
    }
    @Test(groups = {"regression"})
    public void test2(){
        System.out.println("This is test 2...");
    }
    @Test(groups = {"regression"})
    public void test3(){
        System.out.println("This is test 3...");
    }
    @Test(groups = {"sanity", "regression"})
    public void test4(){
        System.out.println("This is test 4...");
    }


}
