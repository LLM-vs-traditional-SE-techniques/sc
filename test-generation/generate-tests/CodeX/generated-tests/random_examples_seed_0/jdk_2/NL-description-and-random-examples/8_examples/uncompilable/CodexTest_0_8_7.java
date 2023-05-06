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


public class CodexTest_0_8_7 { 
    
    
Input: public double getReal() {
        return elements[0];
    }
Output: @Test
    public void testEmptyConstructor() {
        Complex c = new Complex();
        Assert.assertEquals(0.0, c.getReal(), 1.0e-10);
        Assert.assertEquals(0.0, c.getImaginary(), 1.0e-10);
    }
}