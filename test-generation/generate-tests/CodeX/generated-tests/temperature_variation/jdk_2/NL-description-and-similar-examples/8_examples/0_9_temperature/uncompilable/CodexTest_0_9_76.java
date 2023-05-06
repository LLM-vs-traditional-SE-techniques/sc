import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import java.lang.reflect.Field;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SplittableRandom;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_76 { 
  @Test
    public void testIndexOf() {
		for (int i = 0; i < in.length; i++) {
			String x = in[i];
			for (int j = 0; j < in.length; j++) {
				String y = in[j];
				// Assert that the list contains the object y at position i
				assertTrue(y.toString() + " not found at position " + j, list.contains(y));
			}
		}
	}
}