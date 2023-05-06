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


public class CodexTest_0_7_75 { 
  @Test
    public void testContains_real_value() {
        RealDistribution distribution = new UniformRealDistribution();
        double value = distribution.sample();
        RealFieldUnivariateFunction f = new RealFieldUnivariateFunction() {
            public <T extends RealFieldElement<T>> T value(T x) {
                return x;
            }
        };
        RealFieldUnivariateFunction g = compose(f, new RealFieldUnivariateFunction() {
            public <T extends RealFieldElement<T>> T value(T x) {
                return x.sin();
            }
        });
        FieldSinCos<Dfp> sinCos = new FieldSinCos<>(new Dfp(value));
        Dfp sin = sinCos.getSin();
        Dfp cos = sinCos.getCos();
        Dfp expected = sin.add(cos);
        Dfp actual = g.value(new Dfp(value));
        Dfp zero = new Dfp(0);
        Dfp epsilon = new Dfp(1, 100);
        Dfp delta = expected.subtract(actual).abs().divide(epsilon);
        assertTrue(delta.lt(zero));
    }
}