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


public class CodexTest_0_9_8 { 
  @Test
    public void testRemoveIfNotPresnent() {
        List arrayList = new ArrayList();
        arrayList.add(false);
        arrayList.add(null);
        assertFalse(arrayList.remove(2));
        assertFalse(arrayList.remove(null));
    }
}