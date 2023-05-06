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


public class CodexTest_0_8_6 { 
  @Test
    public void testRemoveAt() {
        assertEquals(0, removeAt(0, 0));
        assertEquals(0b1, removeAt(0b1, 0));
        assertEquals(0b10, removeAt(0b10, 1));
        assertEquals(0b100, removeAt(0b100, 2));
        assertEquals(0b1000, removeAt(0b1000, 3));
        assertEquals(0b10000, removeAt(0b10000, 4));
        assertEquals(0b100000, removeAt(0b100000, 5));
        assertEquals(0b1000000, removeAt(0b1000000, 6));
        assertEquals(0b10000000, removeAt(0b10000000, 7));
        assertEquals(0b100000000, removeAt(0b100000000, 8));
        assertEquals(0b1000000000, removeAt(0b1000000000, 9));
        assertEquals(0b10000000000, removeAt(0b10000000000, 10));
        assertEquals(0b100000000000, removeAt(0b100000000000, 11));
        assertEquals(0b1000000000000, removeAt(0b1000000000000, 12));
        assertEquals(0b10000000000000, removeAt(0b10000000000000, 13));
        assertEquals(0b100000000000000, removeAt(0b100000000000000, 14));
        assertEquals(0b1000000000000000, removeAt(0b1000000000000000, 15));
        assertEquals(0b10000000000000000, removeAt(0b10000000000000000, 16));
        assertEquals(0b100000000000000000, removeAt(0b100000000000000000, 17));
        assertEquals(0b1000000000000000000, removeAt(0b1000000000000000000, 18));
        assertEquals(0b10000000000000000000, removeAt(0b10000000000000000000, 19));
        assertEquals(0b100000000000000000000, removeAt(0b100000000000000000000, 20));
        assertEquals(0b1000000000000000000000, removeAt(0b1000000000000000000000, 21
}