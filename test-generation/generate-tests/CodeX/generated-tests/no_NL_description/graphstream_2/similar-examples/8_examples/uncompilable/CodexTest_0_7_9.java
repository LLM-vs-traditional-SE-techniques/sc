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


public class CodexTest_0_7_9 { 
  @Test
    public void testEqualAndHashCode() {
        IndexRequest i1 = new IndexRequest("index", "type", "id");
        IndexRequest i2 = new IndexRequest("index", "type", "id");
        assertTrue(i1.equals(i2));
        assertTrue(i2.equals(i1));
        assertEquals(i1.hashCode(), i2.hashCode());
    }
}