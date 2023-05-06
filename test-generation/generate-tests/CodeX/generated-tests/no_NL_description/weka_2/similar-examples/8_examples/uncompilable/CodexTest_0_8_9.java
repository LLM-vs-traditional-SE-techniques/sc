import weka.core.*;
import java.io.Serializable;
import java.util.Random;

import weka.core.*;
import java.util.Random;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_9 { 
  @Test
	public void testGetAsInstance() {
		// given
		AbstractInstanceGenerator generator = new AbstractInstanceGenerator() {
			@Override
			public Instance createInstance(VecAble vector) {
				return null;
			}
		};
}