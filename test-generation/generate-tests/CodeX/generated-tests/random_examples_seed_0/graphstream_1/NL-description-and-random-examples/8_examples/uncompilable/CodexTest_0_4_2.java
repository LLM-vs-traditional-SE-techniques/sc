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


public class CodexTest_0_4_2 { 
  @Test
    public void containsTest() {
        Edge edge = new Edge();
        edge.setFrom(1);
        edge.setTo(2);
        edge.setCost(3);
        edgePath.add(edge);
        assertTrue(edgePath.contains(edge));
    }
}