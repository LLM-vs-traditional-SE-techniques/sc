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


public class CodexTest_0_8_97 { 
  @Test
    public void test_removeInt() throws Exception {
        JsonArray<String> targets = new JsonArray<String>();
        targets.add("a");
        targets.add("b");
        targets.add("c");
        targets.add("d");
        assertEquals("a", targets.remove(0));
        assertEquals("b", targets.get(0));
        assertEquals("c", targets.get(1));
        assertEquals("d", targets.get(2));
        assertEquals(3, targets.size());
    }
}