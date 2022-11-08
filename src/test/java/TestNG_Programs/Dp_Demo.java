package TestNG_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Dp_Demo {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
    	      new Object[] {"shaileshpokharkar", "8149320390" },
    	      new Object[] {"8149320390", "7620941253" }, 
    	      new Object[] {"7894561323", "1234567899" },
    };
  }
}
