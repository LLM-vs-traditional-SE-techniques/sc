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


public class CodexTest_0_8_4 { 
  @Test
    public static void doubleTest24() {
			double[] data = {1, 2, 3, 4, 5};
			double[] randomData = new double[200];
			for (int i = 0; i < randomData.length; i++)
				randomData[i] = Math.random() - 0.5;
			int index = 0;
			for (double aData : data) {
				double r = data[0];
				data[0] = aData;
				assertEquals("Index " + index + ": " + aData, 
							 r, data[index++]);
			}
}