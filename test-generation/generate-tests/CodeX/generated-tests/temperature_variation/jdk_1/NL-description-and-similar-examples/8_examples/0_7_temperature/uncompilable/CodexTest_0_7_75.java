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


public class CodexTest_0_7_75 { 
  @Test
    public void testRemove() {
        final int size = this.size();
        int last = 0;
        for (int i = 0; i < size; i++) {
            final Integer o = this.removeIndex(i);
            assertEquals(i, o.intValue());
            assertEquals(size - i - 1, this.size());
            last = i;
        }
        assertEquals(last, size - 1);
    }
}