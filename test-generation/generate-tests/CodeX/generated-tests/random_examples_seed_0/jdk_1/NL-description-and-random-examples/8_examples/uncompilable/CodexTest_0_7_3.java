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


public class CodexTest_0_7_3 { 
    @Test
    public void testAddAllRemoveAll() {
        AList l = new AList();
        l.addAll(Arrays.asList(a,b,c));
        l.removeAll(Arrays.asList(b,c));
        Assert.assertEquals(1, l.size());
        Assert.assertEquals(a, l.get(0));
    }
}