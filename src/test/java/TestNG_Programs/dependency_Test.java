package TestNG_Programs;

import org.testng.annotations.Test;

public class dependency_Test {
  @Test(dependsOnMethods = "d")
  public void a() {
  }
  @Test(dependsOnMethods = "c")
  public void b() {
  }
  @Test(dependsOnMethods = "a")
  public void c() {
  }
  @Test
  public void d() {
  }
}
