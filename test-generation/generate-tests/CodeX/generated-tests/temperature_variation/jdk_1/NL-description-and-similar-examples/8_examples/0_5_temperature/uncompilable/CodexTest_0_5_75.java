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


public class CodexTest_0_5_75 { 
  @Test
    public void testRemove() {
        assertEquals(1, list.remove(0));
        assertEquals(2, list.remove(0));
        assertEquals(3, list.remove(0));
        assertEquals(4, list.remove(0));
        assertEquals(5, list.remove(0));
        assertEquals(6, list.remove(0));
        assertEquals(7, list.remove(0));
        assertEquals(8, list.remove(0));
        assertEquals(9, list.remove(0));
    }
}