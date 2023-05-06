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


public class CodexTest_0_8_57 { 
  @Test
    public void testSerializeStreamWithArrayList() throws Exception{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("testSerialize.out"));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add("" + i);
        }
        oos.writeObject(arrayList);
}