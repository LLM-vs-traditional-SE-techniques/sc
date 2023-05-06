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


public class CodexTest_0_8_85 { 
  @Test
    public void testRemove() {
        int i = alist.size();
        while (i > 0) {
            Object o = alist.remove(i - 1);
            assertTrue(o != null);
            assertTrue(alist.size() == (i - 1));
            i--;
        }
    }
}