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


public class CodexTest_0_5_83 { 
  @Test
    public void testRemove() {
        final long[] a = new long[] {1,2,3};
        final LongBigArrayBigList l = new LongBigArrayBigList(a);
        assertEquals(3, l.size64());
        assertEquals(2, l.removeLong(1));
        assertEquals(2, l.size64());
        assertEquals(1, l.getLong(0));
        assertEquals(3, l.getLong(1));
    }
}