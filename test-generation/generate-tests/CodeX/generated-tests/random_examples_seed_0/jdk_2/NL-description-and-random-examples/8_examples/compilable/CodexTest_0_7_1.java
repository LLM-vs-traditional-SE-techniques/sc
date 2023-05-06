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


public class CodexTest_0_7_1 { 
  @Test
    public void testContains() {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        assertTrue(list.contains("a"));
        assertTrue(!list.contains("d"));
    }
}