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


public class CodexTest_0_8_8 { 
  @Test
    public void testRemove() {
        ShortCollection collection = makeCollection();
        collection.remove((short)3);
        assertEquals(3, collection.size());
        assertFalse(collection.contains((short)3));
        collection.remove((short)6);
        assertEquals(2, collection.size());
        assertFalse(collection.contains((short)6));
    }
}