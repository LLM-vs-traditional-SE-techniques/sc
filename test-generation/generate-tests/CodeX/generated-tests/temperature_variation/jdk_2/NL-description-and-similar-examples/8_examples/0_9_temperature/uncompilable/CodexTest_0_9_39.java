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


public class CodexTest_0_9_39 { 
  @Test
    public void testContainsObject() {
        FList<String> fList = cons("54", cons("24", cons("42", cons("82", nil()))));
        #BOOLEAN# res = fList.contains("42");
        Assert.assertTrue(res);
    }
}