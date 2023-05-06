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


public class CodexTest_0_9_55 { 
  @Test
     public void testContains() {
          Vector l = new Vector();
          HashSet s = new HashSet();
          l.add(0, "zero");
          l.add(1, "one");
          l.add(2, "two");
          s.add("zero");
          s.add("one");
          s.add("two");
          assertTrue(l.containsAll(s));
          assertTrue(s.containsAll(l));
     }
}