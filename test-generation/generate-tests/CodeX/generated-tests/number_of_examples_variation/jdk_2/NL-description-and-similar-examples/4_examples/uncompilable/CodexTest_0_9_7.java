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


public class CodexTest_0_9_7 { 
  @Test
        public void testcontains() {
        StringCollection stringCollection = StringCollection.emptyCollection().with("test", "test2");
        assertTrue(stringCollection.contains("test"));
    }
	
Input: public boolean containsAll(Collection c) {
        return collection.containsAll(c);
    }
Output:
	public void testContainsAll()
    {
		Mockery context = new Mockery();
}