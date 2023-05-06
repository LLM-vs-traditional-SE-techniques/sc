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


public class CodexTest_0_8_51 { 
  @Test
    public void testRemove() {
        Vector v = new Vector(5, 3);
        assertEquals(5, v.remove(0));
        assertEquals(true, v.contains(7));
        assertEquals(true, v.contains(9));
        assertEquals(true, v.contains(11));
        assertEquals(2, v.size());
    }
}