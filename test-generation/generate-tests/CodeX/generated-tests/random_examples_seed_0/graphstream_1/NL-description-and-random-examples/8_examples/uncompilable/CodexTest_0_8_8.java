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


public class CodexTest_0_8_8 { 
  @Test
  public void testContains() {
        MyObject q = new MyObject();
        MyObject w = new MyObject();
        MyObject e = new MyObject();
        MyObject r = new MyObject();
        Edge ed = new Edge(q, w);
        Edge edge = new Edge(e, r);
        EdgePath edgePath = new EdgePath();
        edgePath.add(edge);
        assertFalse(edgePath.contains(ed));
    }
}