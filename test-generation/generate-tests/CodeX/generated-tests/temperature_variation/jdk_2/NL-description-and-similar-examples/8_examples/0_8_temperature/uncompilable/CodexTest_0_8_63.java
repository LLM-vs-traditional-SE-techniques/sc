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


public class CodexTest_0_8_63 { 
  @Test
  public void testIsInList() {
    List list = new ArrayList();
    list.add(new String(foo));
    assertTrue(list.contains(foo));
    assertFalse(list.contains(foobar));
  }
}