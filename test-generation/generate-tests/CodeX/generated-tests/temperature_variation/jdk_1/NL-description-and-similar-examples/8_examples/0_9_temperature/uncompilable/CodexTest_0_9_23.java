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


public class CodexTest_0_9_23 { 
  @Test
    public void testRemove() {
        Vector3D p1 = new Vector3D(1, 0, 0);
        Vector3D p2 = new Vector3D(0, 1, 0);
        Vector3D p3 = new Vector3D(0, 0, 1);
        List<Vector3D> l = new ArrayList<Vector3D>();
        assertTrue(l.size() == 0);
		assertTrue(l.isEmpty());
		assertTrue(l.size() == 1);
		assertFalse(l.isEmpty());
		assertTrue(l.size() == 2);
		assertFalse(l.isEmpty());
		assertTrue(l.size() == 3);
		assertFalse(l.isEmpty());
		assertFalse(l.contains(null));
    }
}