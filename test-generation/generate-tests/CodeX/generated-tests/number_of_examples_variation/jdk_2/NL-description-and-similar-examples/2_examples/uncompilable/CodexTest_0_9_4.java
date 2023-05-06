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


public class CodexTest_0_9_4 { 
    @Test
    public void testContainsShouldReturnTrueWhenItemsContainsItemUsingArraysList() {
        // given
        ArrayList<String> items = new ArrayList<>();
        items.add("Winstone");
        SimpleList<String> underTest = new SimpleList<>(items);
        // when
        boolean result = underTest.contains("Winstone");
        // then
        assertTrue(result);
    }
}