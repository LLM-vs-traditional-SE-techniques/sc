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


public class CodexTest_0_7_35 { 
  @Test
    public void testContainsShouldReturnTrueWhenElementGiven() {
        // given
        List<Integer> underTest = Arrays.asList(1, 8, 7);
        // when
        boolean result = underTest.contains(7);
        // then
        assertTrue(result);
    }
}