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


public class CodexTest_0_5_6 { 
  @Test
      public void testContainsEdge(){
			Edge e = new Edge(1,2,3);
			EdgePath ep = new EdgePath();
			ep.add(e);
			assertTrue(ep.contains(e));
		}
}