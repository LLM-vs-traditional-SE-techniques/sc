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


public class CodexTest_0_7_7 { 
  @Test
     public void test_equals_Object_null() {
        Assert.assertNotEquals(null, new Time(1, 2, 3, 4, 5, 6, 7, TimeZone.getDefault()));
    }
}