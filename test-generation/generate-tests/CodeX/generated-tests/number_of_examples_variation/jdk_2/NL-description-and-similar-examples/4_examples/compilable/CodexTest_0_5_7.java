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


public class CodexTest_0_5_7 { 
  @Test
    public void testContains() {
        // given
        List<String> underTest = new ArrayList<String>();
        // when
        underTest.add("one");
        underTest.add("two");
        underTest.add("three");
        // then
        assertTrue(underTest.contains("one"));
        assertTrue(underTest.contains("two"));
        assertTrue(underTest.contains("three"));
        assertFalse(underTest.contains("four"));
    }
}