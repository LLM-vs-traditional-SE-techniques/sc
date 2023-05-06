import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_58 { 
  @Test
  */
public class TestGenJunit {
	public static void main(String[] args) throws Exception {
		Map<String, List<String>> methodMap = new LinkedHashMap<String, List<String>>();
		String signature = null;
		List<String> methodBody = new ArrayList<String>();
		String line = null;
		boolean startReading = false;
		while ((line = readLine()) != null) {
			line = line.trim();
			if (line.length() == 0) {
				if (signature != null) {
					methodMap.put(signature, methodBody);
				}
				startReading = false;
				signature = null;
				methodBody = new ArrayList<String>();
			} else {
				if (startReading) {
					methodBody.add(line);
				}
				if (line.startsWith("public") || line.startsWith("private") || line.startsWith("protected")) {
					startReading = true;
					signature = line.substring(0, line.indexOf({));
				}
			}
		}
		if (signature != null) {
			methodMap.put(signature, methodBody);
		}
}