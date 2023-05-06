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


public class CodexTest_0_7_5 { 
  @Test
  public void testContains() {
    Assert.assertTrue("IndexOf returned invalid value", arr1.contains(1));
    Assert.assertFalse("IndexOf returned invalid value", arr1.contains(5));
    Assert.assertTrue("IndexOf returned invalid value", arr2.contains("x"));
    Assert.assertFalse("IndexOf returned invalid value", arr2.contains("y"));
  }
}