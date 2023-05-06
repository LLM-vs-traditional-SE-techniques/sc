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


public class CodexTest_0_8_5 { 
  @Test
    public void testContains() {
        short[] shortArray = {3, 14, 15, 92, 65, 35, 89, 79, 32, 38, 46, 26, 43, 38, 32, 79, 50, 28, 74, 83, 74, 72};
        ShortList list = new ShortArrayList(shortArray);
        for (int i = 0; i < shortArray.length; i++)
            assertTrue(list.contains(shortArray[i]));
        assertFalse(list.contains((short) 97));
    }
}