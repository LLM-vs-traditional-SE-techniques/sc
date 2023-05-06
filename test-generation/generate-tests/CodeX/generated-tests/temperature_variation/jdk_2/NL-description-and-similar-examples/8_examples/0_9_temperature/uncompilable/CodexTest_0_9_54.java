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


public class CodexTest_0_9_54 { 
  @Test
    public void testContainsOnEnum() {
        StdDeserializerTest.Types v = StdDeserializerTest.Values.A;
        assertTrue(StdDeserializerTest.AnEnum.contains(v));
    }
    public void testContainsOnEnumSet() {
        StdDeserializerTest.Types v = StdDeserializerTest.Values.A;
        assertTrue(StdDeserializerTest.AnEnumSet.contains(v));
    }
    public void testContainsOnCollection() {
        StdDeserializerTest.Types v = StdDeserializerTest.Values.A;
        assertTrue(StdDeserializerTest.EnumAsList.contains(v));
    }
}