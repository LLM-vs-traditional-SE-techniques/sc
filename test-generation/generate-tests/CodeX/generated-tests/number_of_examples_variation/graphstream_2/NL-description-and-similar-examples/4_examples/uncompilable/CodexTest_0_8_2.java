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


public class CodexTest_0_8_2 { 
     @Test
     public void test47() {
         String[] nodes = { "A", "B", "C", "D" };
         String[] edges = { "AB", "BC", "CD" };
 
         Graph<String, String> graph = new DefaultDirectedGraph<String, String>(
                 String.class);
         graph.addVertex("A");
         graph.addVertex("B");
         graph.addVertex("C");
         graph.addVertex("D");
 
         graph.addEdge("AB", "A", "B");
         graph.addEdge("BC", "B", "C");
         graph.addEdge("CD", "C", "D");
 
         DijkstraShortestPath<String, String> dijkstra = new DijkstraShortestPath<String, String>(
                 graph, "A", "D");
         Path<String, String> path = dijkstra.getPath();
 
         DijkstraShortestPath<String, String> dijkstra2 = new DijkstraShortestPath<String, String>(
                 graph, "A", "D");
         Path<String, String> path2 = dijkstra2.getPath();
 
         assertTrue(path.equals(path2));
     }
}