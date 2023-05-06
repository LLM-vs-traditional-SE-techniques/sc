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


public class CodexTest_0_9_32 { 
  @Test
    public void testContainsWhenDuplicatePresentReturnsTrue() {
        // given
        List<String> underTest = newArrayList("one", "two", "one");
        // when
        boolean result = underTest.contains("one");
        // then
        assertTrue(result);
    }
}