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


public class CodexTest_0_7_10 { 
  @Test
  public void testRemove() {
        int ix = m_TestSize - 1;
        Object o = m_List.remove(ix);
        assertTrue(m_List.size() == ix);
        assertTrue(!m_List.contains(o));
    }
```
}