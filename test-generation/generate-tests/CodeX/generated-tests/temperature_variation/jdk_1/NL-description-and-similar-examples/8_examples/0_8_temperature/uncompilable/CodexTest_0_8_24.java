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


public class CodexTest_0_8_24 { 
  @Test
    public void testRemoveByIndex() {
        // Arrange
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 20));
        students.add(new Student("Anna", 20));
        students.add(new Student("Vasiliy", 10));
}