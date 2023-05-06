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


public class CodexTest_0_5_4 { 
  @Test
    public void testContainsShouldReturnFalseWhenObjectNotInList() {
        // given
        List<String> list = new ArrayList<>();
        list.add(first);
        list.add(second);
        // when
        boolean result = list.contains(third);
        // then
        assertFalse(result);
    }
}