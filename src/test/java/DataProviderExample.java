import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @Author: churongzhang
 * @Github: czhang1997
 * @Date: 2/12/22
 * @Description:
 * each data provider must have a name,
 * for whoever usomg the data provider should put the name in the test
 * dataProviderClass is needed if the data provider is not in the same class
 */
public class DataProviderExample {


    @Test(dataProvider = "LoginDataProvider", dataProviderClass = CustomDataProvider.class)
    public void testLogin(String email, String password) {
        System.out.print(email + "\t\t" + password + "\n");
    }
}
