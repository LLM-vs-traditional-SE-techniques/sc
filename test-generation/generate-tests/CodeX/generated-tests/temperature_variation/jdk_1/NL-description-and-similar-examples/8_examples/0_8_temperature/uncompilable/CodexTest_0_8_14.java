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


public class CodexTest_0_8_14 { 
  @Test
    public void testRemoveRange() {
        Vector v = new Vector(1, 2);
        v.removeRange(0, 1);
        assertEquals(1, v.size());
        assertEquals(2, v.elementAt(0));
    }
}