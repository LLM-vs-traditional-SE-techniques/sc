import org.graphstream.graph.*;
import java.util.Collection;
import java.util.List;
import java.util.Stack;
import java.util.logging.Logger;
import java.util.stream.Stream;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Path;
import org.graphstream.graph.implementations.DefaultGraph;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_6 { 
  @Test
    public void testMutableSet() {
        List<String> strings1 = Arrays.asList("a", "b", "c");
        MutableSet<String> set1 = new HashSet<>(strings1);
        MutableSet<String> set2 = new HashSet<>(set1);
        MutableSet<String> set3 = new HashSet<>(set1);
}