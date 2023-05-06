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


public class CodexTest_0_7_6 { 
  @Test
    public void testContainsShouldReturnFalseWhenObjectIsNull() {
        // given
        List<Integer> underTest = new ArrayList<>();
        // when
        boolean result = underTest.contains(null);
        // then
        assertFalse(result);
    }
	
Input: public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }
Output:
    public void testContainsShouldReturnTrueWhenObjectIsContained() {
        // given
        List<String> underTest = new ArrayList<>();
        underTest.add("a");
        // when
        boolean result = underTest.contains("a");
        // then
        assertTrue(result);
    }
```
}