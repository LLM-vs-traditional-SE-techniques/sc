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
    public void remove2() {
		int sz = 15;
        int index = sz/2;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < sz; i++) {
            al.add(i);
        }
        assertEquals(sz, al.size());
        assertEquals(index, al.remove(index).intValue());
        assertEquals(sz-1, al.size());
    }
}