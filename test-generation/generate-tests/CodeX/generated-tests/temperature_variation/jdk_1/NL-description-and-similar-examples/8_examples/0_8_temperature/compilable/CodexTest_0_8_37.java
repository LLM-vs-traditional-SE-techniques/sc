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


public class CodexTest_0_8_37 { 
  @Test
   public void testRemoveNull() {
        Object obj = new Object();
        Vector<Object> v = new Vector<Object>();
        for (int i = 0; i < 100; i++) {
            v.addElement(obj);
        }
        v.addElement(null);
        v.addElement(null);
        v.addElement(null);
        v.addElement(null);
        v.addElement(null);
        v.addElement(null);
        v.addElement(null);
        v.addElement(null);
        v.addElement(null);
        v.addElement(null);
        v.addElement(null);
        v.addElement(null);
        v.addElement(null);
        v.addElement(null);
        v.addElement(null);
        v.removeElement(null);
        v.removeElement(null);
        v.removeElement(null);
        v.removeElement(null);
        v.removeElement(null);
        v.removeElement(null);
        v.removeElement(null);
        v.removeElement(null);
        v.removeElement(null);
        v.removeElement(null);
        v.removeElement(null);
        v.removeElement(null);
        v.removeElement(null);
        v.removeElement(null);
        v.removeElement(null);
        v.removeElement(null);
        v.removeElementAt(0);
        assertEquals(v.size(), 0);
    }
}