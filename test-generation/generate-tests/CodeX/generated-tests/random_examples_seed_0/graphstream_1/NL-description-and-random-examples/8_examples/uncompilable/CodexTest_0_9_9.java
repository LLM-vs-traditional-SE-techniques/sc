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


public class CodexTest_0_9_9 { 
  @Test
  public void testForContainsMethod() {
	  DecisionTree dataTree = new DecisionTree();
	  ArrayList edgePath = new ArrayList<Edge>();
	  double[] m = {1 , 2, 3,4};
	  DenseDoubleVector v = new DenseDoubleVector(m);
	  Edge edge = new Edge(5,6,v);
	  assertEquals(false,  dataTree.contains(edge));
	}
}