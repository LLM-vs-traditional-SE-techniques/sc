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


public class CodexTest_0_8_8 { 
  @Test
    public void testRemove() {
        // remove from beginning
        list.remove(0);
        assertEquals(new Integer(2), list.get(0));
        assertEquals(new Integer(3), list.get(1));
        assertEquals(new Integer(4), list.get(2));
        assertEquals(new Integer(5), list.get(3));
        assertEquals(4, list.size());
}