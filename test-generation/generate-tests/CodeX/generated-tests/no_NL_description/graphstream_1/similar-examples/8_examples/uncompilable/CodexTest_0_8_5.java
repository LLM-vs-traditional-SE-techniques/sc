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


public class CodexTest_0_8_5 { 
  @Test
       public void testContains() {
		Path<V, E> path = new Path<V, E>();
		V v1 = vertexFactory.createVertex();
		V v2 = vertexFactory.createVertex();
		E e1 = edgeFactory.createEdge(v1, v2);
		E e2 = edgeFactory.createEdge(v2, v1);
}