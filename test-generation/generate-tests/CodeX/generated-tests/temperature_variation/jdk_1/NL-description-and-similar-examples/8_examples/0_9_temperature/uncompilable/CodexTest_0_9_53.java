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


public class CodexTest_0_9_53 { 
  @Test
    @GwtIncompatible // SerializableTester
    public void testSerialization_emptyList() throws Exception {
        List<String> list = createEmpty();
        SerializableTester.reserializeAndAssert(list);
    }
}