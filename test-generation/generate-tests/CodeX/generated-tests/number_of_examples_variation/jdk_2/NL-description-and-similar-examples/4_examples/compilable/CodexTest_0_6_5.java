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


public class CodexTest_0_6_5 { 
  @Test
    public void testContainsShouldReturnTrueWhenGivenElementInList() {
        // given
        ArrayList<Integer> underTest = new ArrayList<Integer>();
        underTest.add(1);
        underTest.add(11);
        underTest.add(12);
        // when
        boolean result = underTest.contains(1);
        // then
        assertTrue(result);
    }
}