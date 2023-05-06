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


public class CodexTest_0_7_56 { 
  @Test
    public void testAddRemove() {
        IntArrayList list = new IntArrayList(1);
        list.add(2);
        assertEquals(1, list.size());
        assertEquals(2, list.getInt(0));
        list.remove(0);
        assertEquals(0, list.size());
    }
}