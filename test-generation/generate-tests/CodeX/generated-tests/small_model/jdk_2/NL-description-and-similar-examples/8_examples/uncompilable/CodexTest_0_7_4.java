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


public class CodexTest_0_7_4 { 
  @Test
  public void testContains() {
    assertTrue(this.contains(new Integer(1)));
    assertTrue(this.contains(new Integer(2)));
    assertTrue(this.contains(new Integer(3)));
    assertTrue(this.contains(new Integer(4)));
    assertTrue(this.contains(new Integer(5)));
    assertFalse(this.contains(new Integer(6)));
    assertFalse(this.contains(new Integer(7)));
    assertFalse(this.contains(new Integer(8)));
    assertFalse(this.contains(new Integer(9)));
    assertFalse(this.contains(new Integer(10)));
  }
}