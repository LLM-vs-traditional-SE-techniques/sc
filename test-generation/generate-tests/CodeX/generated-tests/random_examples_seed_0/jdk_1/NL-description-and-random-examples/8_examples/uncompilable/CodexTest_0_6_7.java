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


public class CodexTest_0_6_7 { 
    @Test
    public void testRemove_Index() {
        final int size = 10;
        final Object[] es = new Object[size];
        for (int i = 0; i < size; i++) {
            es[i] = new Object();
        }
        final Object oldValue = new Object();
        es[0] = oldValue;
        final Object[] copyEs = Arrays.copyOf(es, es.length);
}