import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner{
  public static void main(String[] args ){
    Result result = JUnitCore.runClasses(TestCase.class);
    if(!result.wasSuccessful()){
      System.out.println("There is " + result.getFailureCount() + " failure over " + result.getRunCount() + " tests case");
      for(Failure failure : result.getFailures()){
        System.out.println(failure.toString());
      }
    }
    else{
      System.out.println("all tests Pass");
      System.out.println("RunTime: "+result.getRunTime() + " ms");
    }
  }
}
