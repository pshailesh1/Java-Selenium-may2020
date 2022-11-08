package TestNG_Programs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;

import org.testng.IAnnotationTransformer;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.xml.XmlSuite;

public class Listeners_TestNG  implements ITestListener, IReporter, IAnnotationTransformer
{

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("New Test Started" +result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("on Test Success"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("on Test Failure" +result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("on Test Skipped" +result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("on Test Failed But Within Success Percentage" +result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("on Test Failed With Timeout" +result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("on Start" +context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("on Finish" +context.getName());
	}
	
}
