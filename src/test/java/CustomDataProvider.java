import org.testng.annotations.DataProvider;

/**
 * @Author: churongzhang
 * @Github: czhang1997
 * @Date: 2/12/22
 * @Description:
 */
public class CustomDataProvider {

    @DataProvider(name = "LoginDataProvider")
    public Object[][] getData(){
        Object[][] data = {
                {
                        "abc@gmail.com", "abc"
                },
                {
                        "xyz@gmail.com", "xyz"
                }
        };
        return data;
    }
}
