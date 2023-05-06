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


public class CodexTest_0_6_4 { 
    @Test
    public void testContainsWithNull() {
        // given
        List<String> strings = new LinkedList<>();
        strings.add("test");
        strings.add(null);
        // when
        boolean containsNull = strings.contains(null);
        // then
        assertTrue(containsNull);
    }
}