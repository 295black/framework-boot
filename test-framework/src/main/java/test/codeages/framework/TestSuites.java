package test.codeages.framework;

import com.googlecode.junittoolbox.SuiteClasses;
import com.googlecode.junittoolbox.WildcardPatternSuite;
import org.junit.runner.RunWith;

@RunWith(WildcardPatternSuite.class)
@SuiteClasses({"**/*Test.class", "!**/test.codeages.framework.BaseTest.class"})
public class TestSuites {

}
