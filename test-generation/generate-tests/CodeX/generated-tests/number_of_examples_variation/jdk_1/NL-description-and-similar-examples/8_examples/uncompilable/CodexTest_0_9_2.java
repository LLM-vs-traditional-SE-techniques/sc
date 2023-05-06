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


public class CodexTest_0_9_2 { 
  @Test
     public void testRemoveString() {
        final Object[] a = new Object[3];
        a[0] = "a";
        a[1] = "b";
        a[2] = "c";
        final GenericArray<String> g = new GenericArray<>(a);
        g.remove(1);
        check(g, new String[] {"a", null, "c"});
        g.remove(0);
        check(g, new String[] {null, null, "c"});
    }
}