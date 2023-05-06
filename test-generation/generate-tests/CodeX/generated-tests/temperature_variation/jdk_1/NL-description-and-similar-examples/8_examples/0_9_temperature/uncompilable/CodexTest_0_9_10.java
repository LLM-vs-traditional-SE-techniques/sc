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


public class CodexTest_0_9_10 { 
  @Test
    public void remove() {
        int i = 0;
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String o = it.next();
            assertEquals(o, dups.get(i++));
            it.remove();
            dups.remove(o);
        }
        assertEquals(0, list.size());
    }
}