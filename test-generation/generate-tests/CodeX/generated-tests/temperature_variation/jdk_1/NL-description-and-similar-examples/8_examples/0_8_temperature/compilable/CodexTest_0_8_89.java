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


public class CodexTest_0_8_89 { 
  @Test
  public void testRemoveIntFromArrayListWithDuplicates() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(1);
        Integer b = arrayList.remove(0);
        assertEquals(b, new Integer(1));
        assertEquals(arrayList.size(), 1);
        assertEquals(arrayList.get(0), new Integer(1));
    }
}