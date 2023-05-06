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


public class CodexTest_0_9_90 { 
  @Test
    public void testContains() {
        // given
        DoubleList underTest = new DoubleArrayList(new double[]{1.0, 2.0});
        // when
        boolean result1 = underTest.contains(1.0);
        boolean result2 = underTest.contains(3.0);
        // then
        assertTrue(result1);
        assertFalse(result2);
    }
 */
public class SuggestTest {
    private static String[] list = new String[]{
            "public static String getModuleName() {",
            "  return Impl.getModuleName();",
            "}",
            "public static String getModuleName() {",
            "  return Impl.getModuleName();",
            "}",
            "public static String getModuleName() {",
            "  return Impl.getModuleName();",
            "}"
    };
}