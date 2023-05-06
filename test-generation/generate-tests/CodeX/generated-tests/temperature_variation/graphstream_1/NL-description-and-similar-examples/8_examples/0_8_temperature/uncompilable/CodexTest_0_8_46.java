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


public class CodexTest_0_8_46 { 
  @Test
    public void testContains(){
        Graph g = TinkerGraph.open();
        Vertex a = g.addVertex("1");
        Vertex b = g.addVertex("2");
        Vertex c = g.addVertex("3");
        Vertex d = g.addVertex("4");
}