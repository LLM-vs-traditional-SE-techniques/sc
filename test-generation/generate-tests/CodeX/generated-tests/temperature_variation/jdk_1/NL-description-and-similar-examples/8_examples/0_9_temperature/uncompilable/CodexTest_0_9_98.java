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


public class CodexTest_0_9_98 { 
  @Test
    public void testRemoveAtLocation() throws Exception {
        Vector<String> v = new Vector<String>();
        v.add("v1");
        v.add("v2");
        v.add("v3");
        String s = v.remove(1);
}