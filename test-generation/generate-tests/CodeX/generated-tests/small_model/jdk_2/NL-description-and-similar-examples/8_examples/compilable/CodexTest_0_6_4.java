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


public class CodexTest_0_6_4 { 
  @Test
  public void testContains() {
    Vector v = new Vector();
    v.addElement("one");
    assertTrue(v.contains("one"));
    assertTrue(v.contains("ONE"));
    assertFalse(v.contains("two"));
    assertFalse(v.contains("TWO"));
  }
}