import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_3 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    // TODO Fill in the test method body
  }
   */
  public static void main(String[] args) throws Exception {
    // create and setup the pipeline
    Properties props = new Properties();
    props.put("annotators", "tokenize, ssplit, parse, testcase");
    
    StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
    Scanner scanner = new Scanner(System.in);
    String input = "";
    if (args.length > 0) {
    	input = args[0];
    } else {
    	System.out.print("Enter a method and press enter: ");
    	input = scanner.nextLine();
    }
    StringReader s = new StringReader(input);
    
    Annotation annotation = new Annotation(input);
    pipeline.annotate(annotation);
    pipeline.prettyPrint(annotation);
  }
}
}