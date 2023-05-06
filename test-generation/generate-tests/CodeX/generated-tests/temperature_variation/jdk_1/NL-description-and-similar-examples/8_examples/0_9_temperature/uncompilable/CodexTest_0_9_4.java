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


public class CodexTest_0_9_4 { 
  @Test
    public void testRemoveReflectsInOtherButNotInItself() {
        EasyMock.expect(c.removeRange(1, 1)).andReturn(null);
        EasyMock.expect(c.add(0, "a2")).andReturn(true);
        EasyMock.expect(c.add(3, "a3")).andReturn(true);
        c.removeRange(4, 4);
        EasyMock.expect(c.add(2, "a4")).andReturn(true);
        EasyMock.expect(c.add(4, "a5")).andReturn(true);
        control.replay();
        assertTrue(alg.removeAll(c));
        assertListsEqual(alg, Arrays.asList("a5", "a3", "a4"));
        assertListsEqual(c, Arrays.asList("a2", "a5", "a3", "a4"));
        control.verify();
    }
}