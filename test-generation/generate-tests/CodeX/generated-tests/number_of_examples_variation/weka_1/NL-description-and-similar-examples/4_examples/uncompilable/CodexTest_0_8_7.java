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


public class CodexTest_0_8_7 { 
  @Test
     
Input: public static <T> T unmodifiableSet(T s) {
		return (set instanceof java.util.SortedSet<?>)
			? Collections.<T>unmodifiableSortedSet((java.util.SortedSet<T>)set)
			: Collections.<T>unmodifiableSet(set);
	}
Output: public static void jdkTest17() {
			TreeSet<Integer> set = new TreeSet<Integer>();
			set.add(1);
			assertFalse(set instanceof java.util.SortedSet<?>);
		    }
}