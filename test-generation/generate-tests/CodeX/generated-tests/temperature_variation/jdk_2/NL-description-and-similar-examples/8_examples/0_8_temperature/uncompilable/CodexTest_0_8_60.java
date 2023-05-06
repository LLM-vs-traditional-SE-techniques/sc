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


public class CodexTest_0_8_60 { 
    @Test
    public void testContainsObject() {
        // given
        SortedList<String> underTest = new SortedList<>();
        // when
        underTest.add("r");
        underTest.add("t");
        // then
        assertTrue(underTest.contains("r"));
    }
}