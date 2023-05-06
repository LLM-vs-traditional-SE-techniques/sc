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


public class CodexTest_0_9_1 { 
  @Test
   public void testTrimToSizeCopyOnRemove() {
        Vector v = populatedVector();
        Object[] origElements = v.toArray();
        v.copyInto(origElements);
        v.trimToSize();
        v.remove(0);
        v.remove(v.size() - 1);
        v.remove(v.size() / 2);
        String desc = "Trimmed vector after removing 1st, last and middle.";
        assertContentLikeTest(v, desc, origElements, 0, 2, origElements.length - 1);
    }
Input: public void clear() {
	        modCount++;
	        // Let gc do its work
	        for (int i = 0; i < elementCount; i++)
	            elementData[i] = null;
	        elementCount = 0;
	    }
Output: 
  public void testConstructorWithArrayInitialCapacity() {
        MyArrayList vector =
           new MyArrayList(new Object[] { "a", "b", "c"});
        assertTrue("should contain 3 elements: " + vector.toString(),
               vector.size() == 3);
}