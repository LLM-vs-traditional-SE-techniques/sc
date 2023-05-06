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


public class CodexTest_0_9_72 { 
  @Test
    public void testContainsShouldReturnFalseWhenValueNotInArray() {
        // given
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        // when
        boolean result = ArrayUtilsEx.contains(array, 7);
        // then
        assertFalse(result);
    }

}