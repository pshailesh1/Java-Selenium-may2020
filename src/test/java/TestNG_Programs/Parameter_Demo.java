package TestNG_Programs;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Demo 
{
	@Test
	@Parameters({"val1","val2"})
	public void add(int v1, int v2) {
		int sum = v1+v2;
		System.out.println(sum);
	}
	@Test
	@Parameters({"val1","val2"})
	public void sub(int v1, int v2) {
		int substract = v1-v2;
		System.out.println(substract);
	};
	@Test
	@Parameters({"val1","val2"})
	public void div(int v1, int v2) {
		int division = v1/v2;
		System.out.println(division);
	};
	@Test
	@Parameters({"val1","val2"})
	public void mul(int v1, int v2) {
		int multiplication = v1*v2;
		System.out.println(multiplication);
	}
	

}
