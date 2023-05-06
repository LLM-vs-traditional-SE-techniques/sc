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


public class CodexTest_0_7_40 { 
  @Test
     public void testContains() {
        String[] objArray = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        List<String> list = new ArrayList<String>();
        for (String s : objArray) {
            list.add(s);
        }
        for (int i = 0; i < objArray.length; i++) {
            assertTrue("contains should return true for contained object", list.contains(objArray[i]));
        }
        assertTrue("contains should return true for contained object", list.contains("a"));
        assertFalse("contains should return false for non-contained object", list.contains("k"));
        assertFalse("contains should return false for non-contained object", list.contains(null));
    }
}