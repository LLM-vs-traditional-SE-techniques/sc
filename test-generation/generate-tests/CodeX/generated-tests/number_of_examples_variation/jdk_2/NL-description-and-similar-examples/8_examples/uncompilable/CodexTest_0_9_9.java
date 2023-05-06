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


public class CodexTest_0_9_9 { 
  @Test
    public void testContainsInvalidObject() {
        List<String> testList = new ArrayList<>();
        assertFalse(testList.contains(new Object()));
    }
Input: public String getName() {
		return name;
	}
Output: public void testGetName() {
		assertEquals(foo, this.element.name);
	}
}