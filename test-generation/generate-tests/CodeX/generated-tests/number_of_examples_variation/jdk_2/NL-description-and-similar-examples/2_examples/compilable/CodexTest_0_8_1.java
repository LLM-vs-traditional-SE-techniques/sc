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


public class CodexTest_0_8_1 { 
  @Test
    public void testContainsWhenObjectIsNullThenShouldReturnFalse() {
        // given
        List<Integer> underTest = Arrays.asList(1, 2, 3);
        // when
        boolean result = underTest.contains(null);
        // then
        assertFalse(result);
    }
}