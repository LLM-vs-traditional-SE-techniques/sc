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


public class CodexTest_0_9_6 { 
  @Test
    public void testContainsObject() {
        AlgBitSet set = new AlgBitSet();
        set.set(2);
        Object o = new Object();
        Object[] nonMembers = {set, null, new Object()};
        Object[] members = {set.clone(), set,
                            "AlgBitSet[size=4, bits=4]"};
        for (int i = 0; i < nonMembers.length; ++i) {
            assertFalse(set.contains(nonMembers[i]));
        }
        for (int i = 0; i < members.length; ++i) {
            assertTrue(set.contains(members[i]));
        }
    }
}