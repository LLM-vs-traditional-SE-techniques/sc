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


public class CodexTest_0_9_33 { 
  @Test
    public void testRemoveInMiddle(){
        List<Integer> seq = new ArrayList<>();
        int index = 1;
        seq.add(1);
        seq.add(2);
        seq.add(2);
        seq.add(4);
        assertEquals(4,seq.size());
        assertEquals(seq.get(index),seq.remove(index));
        assertEquals(seq.get(index-1),seq.get(index));
    }
}