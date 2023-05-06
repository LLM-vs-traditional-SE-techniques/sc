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


public class CodexTest_0_7_8 { 
  @Test
    public void testContainsShouldReturnTrueWhenItemIsInTheList() {
        // given
        List<String> underTest = new LinkedList<>();
        underTest.add("item1");
        underTest.add("item2");
        // when
        boolean result = underTest.contains("item1");
        // then
        assertTrue(result);
    }
}