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
    public void testContainsShouldReturnTrueWhenElementIsPresent() {
        // given
        String[] elements = new String[]{"element1", "element2", "element3"};
        ArrayList<String> underTest = new ArrayList<>(Arrays.asList(elements));
        // when
        boolean result = underTest.contains("element2");
        // then
        assertTrue(result);
    }
}