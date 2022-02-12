package listener;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * @Author: churongzhang
 * @Github: czhang1997
 * @Date: 2/12/22
 * @Description:
 */
// use this or run using the xml config
//@Listeners(CustomListeners.class)
public class ListenerTest {

    @Test
    public void test1(){
        System.out.println("This is test 1");
        Assert.assertEquals("A", "A");
    }

    @Test
    public void test2(){
        System.out.println("This is test 2");
        Assert.assertEquals("A", "B");
    }

    @Test
    public void test3(){
        System.out.println("This is test 3");
        throw new SkipException("This is skip exception");
    }
}
