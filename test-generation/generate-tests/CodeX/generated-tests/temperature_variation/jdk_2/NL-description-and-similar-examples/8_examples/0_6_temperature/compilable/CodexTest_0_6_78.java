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


public class CodexTest_0_6_78 { 
  @Test
    public void testContains() {
        String[] data = { "A", "B", "C" };
        Set<String> set = new HashSet<String>();
        for (String s : data) {
            set.add(s);
        }
        for (String s : data) {
            assertTrue(set.contains(s));
        }
    }
}