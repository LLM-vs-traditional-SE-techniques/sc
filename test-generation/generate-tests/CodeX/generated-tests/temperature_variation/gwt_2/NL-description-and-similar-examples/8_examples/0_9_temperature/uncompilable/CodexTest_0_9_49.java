import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_49 { 
  @Test
  
  public void testUncaughtExceptionHandlerToString(){
    GWT.getUncaughtExceptionHandler().toString();
  }
  
  public void testGetUncaughtExceptionHandler(){
    GWT.getUncaughtExceptionHandler();
  }`
	
	cases := strings.Split(input, "Output:")
	for _, testCase := range cases {
		if len(testCase) == 0 {
			continue
		}
		input = strings.Split(testCase, "Input:")[1]
		template := strings.Split(testCase, "Output:")[1]
		
		ast, err := gocommon.ParseString(strings.TrimSpace(input))
		if err != nil {
			log.Println(err)
			continue
		}
		
		if method, ok := ast.(gocommon.Object).GetType().(*gocommon.MethodType); ok {
			testData := gocommon.NewStubber(method).Showcase()
			testName := strings.Split(method.String(), "(")[0]
			testClassName := "Test_" + method.GetPackage().Name()
			actual := fmt.Sprintf("\nClass name: %s\n" +
				"Test name: %s\n" +
				"Input:\n%s\n" +
				"Generated test code:\n" +
				"public void %s() {\n%s}\n", testClassName, testName, input, testName, testData)
			
			assert.Equal(t, strings.TrimSpace(template), strings.TrimSpace(actual))
		}
	}
}
}