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


public class CodexTest_0_6_9 { 
  @Test
      public void testContains() {
        AlgVector v = new AlgVector(10);
        assertFalse("Contains element", v.contains(new Double(3.14)));
        v.setElement(5, 3.14);
        assertTrue("Does not contain element", v.contains(new Double(3.14)));
      }
}