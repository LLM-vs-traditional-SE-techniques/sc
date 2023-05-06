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


public class CodexTest_0_5_9 { 
  @Test
    public void testContainsShouldReturnTrueWhenObject() {
        // given
        List<Integer> underTest = new ArrayList<>();
        underTest.add(1);
        underTest.add(2);
        underTest.add(3);
        // when
        boolean result = underTest.contains(1);
        // then
        assertTrue(result);
    }
}