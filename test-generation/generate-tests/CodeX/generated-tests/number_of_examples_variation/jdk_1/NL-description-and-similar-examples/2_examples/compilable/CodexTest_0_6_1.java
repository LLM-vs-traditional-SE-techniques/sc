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


public class CodexTest_0_6_1 { 
        @Test
        public void testRemove() {
            int index = 0;
            int size = 10;
            Object oldValue = new Object();
            Object[] es = new Object[size];
            es[index] = oldValue;
            ArrayList<Object> arrayList = new ArrayList<Object>();
            arrayList.remove(index);
            assertEquals(oldValue, arrayList.get(index));
            assertEquals(size - 1, arrayList.size());
        }
}