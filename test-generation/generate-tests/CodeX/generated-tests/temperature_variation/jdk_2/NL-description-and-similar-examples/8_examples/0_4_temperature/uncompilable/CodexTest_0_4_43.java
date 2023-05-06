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


public class CodexTest_0_4_43 { 
  @Test
    public void testContainsObject() {
        SimpleTreeNode root = new SimpleTreeNode("root");
        SimpleTreeNode child1 = new SimpleTreeNode("child1");
        SimpleTreeNode child2 = new SimpleTreeNode("child2");
        root.add(child1);
        root.add(child2);
        assertTrue(root.contains(child1));
        assertTrue(root.contains(child2));
        assertFalse(root.contains(new SimpleTreeNode("child3")));
    }
}