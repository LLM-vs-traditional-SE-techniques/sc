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


public class CodexTest_0_8_47 { 
  @Test
    public void testContainsReturnTrueForElement2() {
    // given
    List<String> underTest = Arrays.asList("element1", "element2", "element3");
    // when
    boolean result = underTest.contains("element2");
    // then
    assertTrue("Should return true for element2 but did not.", result);
  }
}