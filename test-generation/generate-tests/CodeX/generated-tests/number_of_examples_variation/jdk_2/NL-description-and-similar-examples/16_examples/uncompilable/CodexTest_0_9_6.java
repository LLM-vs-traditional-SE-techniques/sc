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


public class CodexTest_0_9_6 { 
   @Test
    public void classCollectionHasElement() {
        ClassCollection classCollection = createClassCollection();
        Class<ClassCollectionTest> testClass = ClassCollectionTest.class;
        assertTrue(classCollection.contains(testClass));
        classCollection.add(testClass);
        assertTrue(classCollection.contains(testClass));
    }
}