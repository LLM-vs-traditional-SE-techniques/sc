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


public class CodexTest_0_5_31 { 
  @Test
    public void testContains() {
        HashMap m = new HashMap();
        m.put("a", "b");
        assertTrue(m.containsKey("a"));
        assertTrue(m.containsValue("b"));
        assertFalse(m.containsKey("b"));
        assertFalse(m.containsValue("a"));
    }

}