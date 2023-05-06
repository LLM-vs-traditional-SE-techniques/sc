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


public class CodexTest_0_9_4 { 
  @Test
    public void testContainsNegative(){
        Integer startNode = 1;
        Integer endNode = 2;
        Integer startNode2 = 4;
        Integer endNode2 = 7;
        Edge<Integer> neg = new Edge <Integer>(startNode, endNode);
        Edge<Integer> neg2 = new Edge <Integer>(startNode2, endNode2);
        Set<Edge<Integer>> negativeEdges = new HashSet<Edge<Integer>>();
        negativeEdges.add(neg);
        negativeEdges.add(neg2);
        EdgePath<Integer> negEdgePath = new EdgePath<Integer>(startNode, endNode, negativeEdges);
        assertFalse(negEdgePath.contains(neg));
    }
}