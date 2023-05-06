import com.google.common.hash.*;
import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;
import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedInts;
import java.io.Serializable;

import static com.google.common.io.BaseEncoding.base16;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.io.BaseEncoding;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_9 { 
  @Test
    */
    public void proposeTest(String codeLine) {
    	List<String> testMethodNames = getMethodNames(codeLine);
    	if(testMethodNames != null && !testMethodNames.isEmpty()) {
    		String suggestedTestMethodName = "test" + String.valueOf(testMethodNames.get(0).substring(0,1).toUpperCase() + testMethodNames.get(0).substring(1));
    		
    		String output = "public void " + suggestedTestMethodName + "() {\n\t\t}\n\n";
    		System.out.println(output);
    	}
    }
    
    private List<String> getMethodNames(String codeLine) {
    	codeLine = codeLine.trim();
    	
    	//check for first keyword public or private or package or protected
    	if(!codeLine.startsWith("public") && 
    			!codeLine.startsWith("private") && 
    			!codeLine.startsWith("package") && 
    			!codeLine.startsWith("protected")) {
    		return null;
    	}
    	
    	//check for static keyword
    	if(codeLine.startsWith("public static")) {
    		codeLine = codeLine.substring(12, codeLine.length());
    	} else if(codeLine.startsWith("private static")) {
    		codeLine = codeLine.substring(13, codeLine.length());
    	} else if(codeLine.startsWith("protected static")) {
    		codeLine = codeLine.substring(14, codeLine.length());
    	} else if(codeLine.startsWith("package static")) {
    		codeLine = codeLine.substring(12, codeLine.length());
    	} else if(codeLine.startsWith("public")) {
    		codeLine = codeLine.substring(7, codeLine.length());
    	} else if(codeLine.startsWith("private")) {

}