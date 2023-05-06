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


public class CodexTest_0_8_10 { 
  @Test
    public void testFastRemoveWithGap() {
        final int[] DATA = { 1, 2, 3, 4, 5, 6, 7 };
        final Object[] OLD_DATA = Arrays.copyOf(DATA, DATA.length);
        final int[] NEW_DATA = Arrays.copyOf(DATA, DATA.length);
        final Integer[] OLD_DATA_WRAPPED = Arrays.copyOf(DATA, DATA.length);
        final int REMOVED = 3;
        NEW_DATA[REMOVED] = -3;
        final Integer REMOVED_WRAPPED;
        {
            Integer removed = OLD_DATA[REMOVED];
            OLD_DATA[REMOVED] = null;
            REMOVED_WRAPPED = removed;
        }
        fastRemove(OLD_DATA, REMOVED);
        assertArrayEquals(NEW_DATA, OLD_DATA);
        assertArrayEquals(OLD_DATA_WRAPPED, OLD_DATA_WRAPPED);
        assertEquals(REMOVED_WRAPPED, OLD_DATA_WRAPPED[REMOVED]);
    }
}