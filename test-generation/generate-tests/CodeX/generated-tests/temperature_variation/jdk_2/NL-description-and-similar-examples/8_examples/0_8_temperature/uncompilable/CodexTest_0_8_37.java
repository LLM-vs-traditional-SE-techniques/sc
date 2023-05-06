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


public class CodexTest_0_8_37 { 
  @Test
     public void testContains() {
        int[] data = new int[] {-1, 0, 1, 2, 3};
        ArrayIntList list = new ArrayIntList(data);
        for (int i = 0; i < data.length; i++) {
            assertTrue("contains(" + data[i] + ")", list.contains(data[i]));
        }
        assertTrue("contains(5)", !list.contains(5));
        assertTrue("contains(null)", !list.contains(null));
    }
}